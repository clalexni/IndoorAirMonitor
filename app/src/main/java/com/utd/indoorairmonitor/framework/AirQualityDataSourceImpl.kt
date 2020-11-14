package com.utd.indoorairmonitor.framework

import android.util.Log
import com.utd.indoorairmonitor.data.AirQualityDataSource
import com.utd.indoorairmonitor.domain.AirQuality
import com.utd.indoorairmonitor.framework.purpleAirAPI.Model.MonitorResponse
import com.utd.indoorairmonitor.framework.purpleAirAPI.PurpleAirApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AirQualityDataSourceImpl: AirQualityDataSource {

    private var indoorAirMonitor: AirQuality = AirQuality("",0.0,0.0)

    val purpleAirRetrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://www.purpleair.com/")
            .build()

    val purpleAirApi = purpleAirRetrofit.create(PurpleAirApi::class.java)

    val purpleAirApiCall: Call<MonitorResponse> = purpleAirApi.getAllDataPoints()

    override suspend fun read(): AirQuality {
        return indoorAirMonitor
    }
    override suspend fun readPM2_5(): Double
    {
        purpleAirApiCall.enqueue(object: Callback<MonitorResponse> {
            override fun onFailure(call: Call<MonitorResponse>, t: Throwable) {
                Log.e("ERROR", t.message.toString())
            }

            override fun onResponse(call: Call<MonitorResponse>, response: Response<MonitorResponse>) {

                val fullData: MonitorResponse = response.body()!!
                val stringBuilder = StringBuilder()

                //Set 2_5 and 10_0 here
                val pm2_5 = fullData.data[0].pm_2
                indoorAirMonitor.pm2_5 = pm2_5!!
            }
        })

        return indoorAirMonitor.pm2_5
    }

    override suspend fun readPM10_0(): Double
    {
        purpleAirApiCall.enqueue(object: Callback<MonitorResponse> {
            override fun onFailure(call: Call<MonitorResponse>, t: Throwable) {
                Log.e("ERROR", t.message.toString())
            }

            override fun onResponse(call: Call<MonitorResponse>, response: Response<MonitorResponse>) {

                val fullData: MonitorResponse = response.body()!!
                val stringBuilder = StringBuilder()

                //Set 2_5 and 10_0 here
                val pm_10 = fullData.data[0].pm_10
                indoorAirMonitor.pm10_0 = pm_10!!
            }
        })

        return indoorAirMonitor.pm10_0
    }

    override suspend fun setDeviceName(name: String) {
        indoorAirMonitor.deviceID = name
    }

}
package com.raywenderlich.android.majesticreader.framework

import com.example.airqualitymonitoring.data.AirQualityDataSource
import com.example.airqualitymonitoring.domain.AirQuality
import com.raywenderlich.android.majesticreader.framework.purpleAirAPI.PurpleAirApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.net.URL

class AirQualityDataSourceImpl: AirQualityDataSource {

    private var indoorAirMonitor: AirQuality = AirQuality("23",0.0,0.0)

    override suspend fun read(): AirQuality {
        return indoorAirMonitor
    }
    override suspend fun readPM2_5(): Double
    {
        updateAirMonitorData()
        return indoorAirMonitor.pm2_5
    }

    override suspend fun readPM10_0(): Double
    {
        updateAirMonitorData()
        return indoorAirMonitor.pm10_0
    }

    override suspend fun setDeviceName(name: String) {
        indoorAirMonitor.deviceID = name
    }

    private suspend fun updateAirMonitorData()
    {
        val url = "https://www.purpleair.com/json?show="
        val airMonitorUrl = url + indoorAirMonitor.deviceID

        val purpleAirResponse = getUrlResponse(airMonitorUrl)
        val result: JSONObject = parsePurpleAirResponse(purpleAirResponse)

        if (result.has("pm2_5_atm"))
            indoorAirMonitor.pm2_5 = result.getDouble("pm2_5_atm")

        if (result.has("pm10_0_atm"))
            indoorAirMonitor.pm2_5 = result.getDouble("pm2_5_atm")
    }

    private suspend fun getUrlResponse(url : String) : String {
        var response = ""
        val job = GlobalScope.launch {
            response = URL(url).readText()
        }
        job.join()
        return response
    }

    private fun parsePurpleAirResponse(purpleAirResponse: String): JSONObject {
        val responseJSON = JSONObject(purpleAirResponse)
        val results = responseJSON.getJSONArray("results")
        return results[0] as JSONObject
    }

    //Look into looping a function call every 5 mins or so.

}
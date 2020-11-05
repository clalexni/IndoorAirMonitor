package com.raywenderlich.android.majesticreader.framework

import android.util.Log
import com.example.airqualitymonitoring.data.AirQualityDataSource
import com.example.airqualitymonitoring.domain.AirQuality
import com.google.gson.JsonArray
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import java.lang.Exception
import java.net.URL

class AirQualityDataSourceImpl: AirQualityDataSource {

    private var airMonitor: AirQuality = AirQuality("23",0.0,0.0)

    override suspend fun updateAirMonitor(): AirQuality {
        val url = "https://www.purpleair.com/json?show="
        val airMonitorUrl = url + airMonitor.deviceID

        val purpleAirResponse = getUrlResponse(airMonitorUrl)
        val result: JSONObject = parsePurpleAirResponse(purpleAirResponse)

        if (result.has("pm2_5_atm") && result.getDouble("pm2_5_atm") != null)
            airMonitor.pm2_5 = result.getDouble("pm2_5_atm")

        if (result.has("pm10_0_atm") && result.getDouble("pm10_0_atm") != null)
            airMonitor.pm10_0 = result.getDouble("pm10_0_atm")
        else
            Log.e("URL request", "Request returned empty data")

        return airMonitor
    }
    override suspend fun getPM2_5(): Double
    {
        return airMonitor.pm2_5
    }

    override suspend fun getPM10_0(): Double
    {
        return airMonitor.pm10_0
    }

    override fun setDeviceName(name: String) {
        airMonitor.deviceID = name
    }



    private suspend fun getUrlResponse(url : String) : String {
        var response = ""
        val job = GlobalScope.launch {
                try {
                    response = URL(url).readText()
                }
                catch (e:Exception){
                    Log.e("URL request", "Request failed")
                }
        }
        job.join()
        return response
    }

    private fun parsePurpleAirResponse(purpleAirResponse: String): JSONObject {
        if (purpleAirResponse == null || purpleAirResponse == "") return  JSONObject().put("Nothing","nope")
        val responseJSON = JSONObject(purpleAirResponse)
        val results = responseJSON.getJSONArray("results")
        if (results.length() == 0 || results == null) return  JSONObject().put("Nothing","nope")
        return results[0] as JSONObject
    }

    //Look into looping a function call every 5 mins or so.

}
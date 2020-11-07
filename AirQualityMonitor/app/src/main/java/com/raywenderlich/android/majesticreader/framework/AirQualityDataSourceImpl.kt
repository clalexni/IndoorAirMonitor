package com.raywenderlich.android.majesticreader.framework

import android.util.Log
import com.example.airqualitymonitoring.data.AirQualityDataSource
import com.example.airqualitymonitoring.domain.AirQuality
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.lang.Exception
import java.net.URL

class AirQualityDataSourceImpl: AirQualityDataSource {
    private var airMonitor: AirQuality = AirQuality("65536",0.0,0.0)

    override suspend fun updateAirMonitor(): AirQuality {
        val getRequest = "https://www.purpleair.com/json?show="
        val deviceGetRequest = getRequest + airMonitor.deviceID

        val purpleAirJson = getJsonResponse(deviceGetRequest)
        val isValidJson = validateAirMonitorJson(purpleAirJson)
        if (isValidJson){
            val result = parsePurpleAirJson(purpleAirJson)
            airMonitor.pm2_5 = result.first
            airMonitor.pm10_0 = result.second
        }
        else //put in validate.
            Log.e("JSON Validation", "Request returned empty data")

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

    private suspend fun getJsonResponse(url: String): JSONObject {
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
        val x = 0
        return if (response.isNotEmpty()) JSONObject(response) else JSONObject()
    }

    private fun validateAirMonitorJson(json: JSONObject): Boolean {
        if (json == null) return false

        val resultsArray = json.getJSONArray("results")
        val isEmptyJson = resultsArray.length() == 0
        if (isEmptyJson) return false

        val deviceJson = resultsArray[0] as JSONObject
        val jsonKeys = listOf("pm2_5_atm", "pm10_0_atm")

        val hasKeys = validateJsonKeys(deviceJson, jsonKeys)
        if(!hasKeys)
            return false

        return true
    }
    private fun validateJsonKeys(json: JSONObject, jsonKeys : List<String>) : Boolean {
        for (jsonKey in jsonKeys){
            if (!json.has(jsonKey)) {
                Log.e("JSON Key not found", jsonKey)
                return false
            }
            if (json.get(jsonKey) == null) {
                Log.e("JSON Value not found", jsonKey)
                return false
            }
        }

        return true
    }

    private fun parsePurpleAirJson(responseJSON: JSONObject): Pair<Double,Double> {
        val resultsArray = responseJSON.getJSONArray("results")

        val deviceJson = resultsArray[0] as JSONObject
        val childDeviceJson : JSONObject
        if (resultsArray.length() > 1)
            childDeviceJson = resultsArray[1] as JSONObject

        //Can implement some criteria to pick between the two if wanted.
        //like averaging.

        val device_PM2_5 = deviceJson.getDouble("pm2_5_atm")
        val device_PM10_0 = deviceJson.getDouble("pm10_0_atm")

        return Pair(device_PM2_5,device_PM10_0)
    }
}
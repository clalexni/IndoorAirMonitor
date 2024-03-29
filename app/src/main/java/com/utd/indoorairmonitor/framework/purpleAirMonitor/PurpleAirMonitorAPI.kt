package com.utd.indoorairmonitor.framework.purpleAirMonitor

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.lang.Exception
import java.net.URL

import com.utd.indoorairmonitor.data.AirMonitorDataSource
import com.utd.indoorairmonitor.domain.AirMonitor

class PurpleAirMonitorAPI: AirMonitorDataSource {

    //This is basically in memory while room would move this and that Dao object would
    //be used instead.
    private var purpleAirMonitor: AirMonitor = AirMonitor("0",0.0,0.0)

    override fun getPM2_5() = purpleAirMonitor.pm2_5
    override fun getPM10_0() = purpleAirMonitor.pm10_0
    override fun setID(id: String) {
        purpleAirMonitor.ID = id
    }

    //This function needs to have the inside methods used turned into a Utility class.
    override suspend fun updateAirMonitor(): AirMonitor {
        val getRequest = "https://www.purpleair.com/json?show="
        val deviceGetRequest = getRequest + purpleAirMonitor.ID

        val purpleAirJson = getJsonResponse(deviceGetRequest)
        val isValidJson = validateAirMonitorJson(purpleAirJson)
        if (isValidJson){
            val result = parsePurpleAirJson(purpleAirJson)
            purpleAirMonitor.pm2_5 = result.first
            purpleAirMonitor.pm10_0 = result.second
        }
        else //put in validate.
            Log.e("JSON Validation", "Request returned empty data")

        return purpleAirMonitor
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
        if (resultsArray.length() == 0) return false

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
            if (json.isNull(jsonKey)) {
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
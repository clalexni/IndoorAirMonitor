package com.utd.indoorairmonitor.framework

import com.utd.indoorairmonitor.interactors.airMonitor.*
import com.utd.indoorairmonitor.interactors.mlModel.*
import com.utd.indoorairmonitor.interactors.weather.*

data class Interactors(
        //Air Monitor Use cases
        val updateAirMonitor: UpdateAirMonitor,
        val getPM2_5: GetPM2_5,
        val getPM10_0: GetPM10_0,
        val setAirMonitorID: SetAirMonitorID,

        //Weather Use cases
        val updateWeather: UpdateWeather,
        val getHumidity: GetHumidity,
        val getTemperature: GetTemperature,
        val setZipCode: SetZipCode,

        //ML Model Use case
        val predictMLResults: PredictMLResults,
        val getMLResults: GetMLResults,
        val getMLOutput1: GetMLOutput1,
        val getMLOutput2: GetMLOutput2
)

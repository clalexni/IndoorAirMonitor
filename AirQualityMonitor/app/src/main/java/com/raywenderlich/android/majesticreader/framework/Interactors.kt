package com.raywenderlich.android.majesticreader.framework

import com.example.appCore.interactors.AirMonitor.*
import com.example.appCore.interactors.MLModel.*
import com.example.appCore.interactors.Weather.*
import com.raywenderlich.android.majesticreader.interactors.*

data class Interactors(
        val addBookmark: AddBookmark,
        val getBookmarks: GetBookmarks,
        val deleteBookmark: RemoveBookmark,

        val addDocument: AddDocument,
        val getDocuments: GetDocuments,
        val removeDocument: RemoveDocument,
        val getOpenDocument: GetOpenDocument,
        val setOpenDocument: SetOpenDocument,

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

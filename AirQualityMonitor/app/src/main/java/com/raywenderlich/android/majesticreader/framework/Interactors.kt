package com.raywenderlich.android.majesticreader.framework

import com.example.airqualitymonitoring.interactors.ReadAirQuality
import com.example.airqualitymonitoring.interactors.ReadPM10_0
import com.example.airqualitymonitoring.interactors.ReadPM2_5
import com.example.airqualitymonitoring.interactors.SetMonitorDeviceName
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
    val readAirQuality: ReadAirQuality,
    val readPM2_5: ReadPM2_5,
    val readPM10_0: ReadPM10_0,
    val setMonitorDeviceName: SetMonitorDeviceName
)

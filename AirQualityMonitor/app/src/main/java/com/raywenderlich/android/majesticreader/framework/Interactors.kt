package com.raywenderlich.android.majesticreader.framework

import com.example.appCore.interactors.UpdateAirMonitor
import com.example.appCore.interactors.GetPM10_0
import com.example.appCore.interactors.GetPM2_5
import com.example.appCore.interactors.SetAirMonitorID
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

        val updateAirMonitor: UpdateAirMonitor,
        val getPM2_5: GetPM2_5,
        val getPM10_0: GetPM10_0,
        val setAirMonitorID: SetAirMonitorID
)

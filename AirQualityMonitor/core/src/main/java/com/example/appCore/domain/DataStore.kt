package com.example.appCore.domain

import java.time.LocalDateTime

data class DataStore(val airMonitor: AirMonitor,
                     val peakFlow: PeakFlow,
                     val questionnaire: Questionnaire,
                     val weather: Weather) {

    //val timeStamp = LocalDateTime.now()

}
package com.example.appCore.domain

import java.time.LocalDateTime


data class DataStore(val airMonitor: AirMonitor,
                     val peakFlow: PeakFlow,
                     val questionnaire: Questionnaire,
                     val weather: Weather) {

    //wasn't working because it requires API 26 and above
    //val timeStamp = LocalDateTime.now()

}
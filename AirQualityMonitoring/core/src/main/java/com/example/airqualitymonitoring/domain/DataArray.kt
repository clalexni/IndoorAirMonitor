package com.example.airqualitymonitoring.domain

import java.time.LocalDateTime

data class DataArray(val airQuality: AirQuality,
                     val peakFlow: PeakFlow,
                     val questionnaire: Questionnaire,
                     val weather: Weather) {

    val timeStamp = LocalDateTime.now()

}
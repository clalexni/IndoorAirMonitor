package com.example.airqualitymonitoring.domain

import java.time.LocalDateTime

data class RawData(val airQuality: AirQuality,
                   val peakFlow: PeakFlow,
                   val questionnaire: Questionnaire,
                   val weather: Weather,
                   val localDateTime: LocalDateTime
) {

}
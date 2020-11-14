package com.utd.indoorairmonitor.domain
import java.time.LocalDateTime

data class DataStore(val airQuality: AirQuality,
                     val peakFlow: PeakFlow,
                     val questionnaire: Questionnaire,
                     val weather: Weather) {

    val timeStamp = LocalDateTime.now()

}
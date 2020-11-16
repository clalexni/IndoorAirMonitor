package com.utd.indoorairmonitor.domain


data class DataStore(val airMonitor: AirMonitor,
                     val peakFlow: PeakFlow,
                     val questionnaire: QuestionnaireAnswer,
                     val weather: Weather) {

    //wasn't working because it requires API 26 and above
    //val timeStamp = LocalDateTime.now()

}
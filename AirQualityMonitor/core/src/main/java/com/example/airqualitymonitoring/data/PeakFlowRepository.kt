package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.PeakFlow

class PeakFlowRepository(private val dataSource: PeakFlowDataSource) {

    suspend fun getPeakFlow(peakFlow: PeakFlow) {
        dataSource.read(peakFlow)
    }

}
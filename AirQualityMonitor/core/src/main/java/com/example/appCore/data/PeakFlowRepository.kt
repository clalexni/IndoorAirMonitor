package com.example.appCore.data

import com.example.appCore.domain.PeakFlow

class PeakFlowRepository(private val dataSource: PeakFlowDataSource) {

    suspend fun getPeakFlow(peakFlow: PeakFlow) {
        dataSource.read(peakFlow)
    }

}
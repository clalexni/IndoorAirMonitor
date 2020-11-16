package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

class PeakFlowRepository(private val dataSource: PeakFlowDataSource) {

    suspend fun getPeakFlow() = dataSource.getPeakFlow()
    suspend fun setPeakFlow(peakFlow: Double) = dataSource.setPeakFlow(peakFlow)

}
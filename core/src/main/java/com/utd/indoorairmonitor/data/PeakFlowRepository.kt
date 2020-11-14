package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

class PeakFlowRepository(private val dataSource: PeakFlowDataSource) {

    suspend fun getPeakFlow(peakFlow: PeakFlow) {
        dataSource.read(peakFlow)
    }

}
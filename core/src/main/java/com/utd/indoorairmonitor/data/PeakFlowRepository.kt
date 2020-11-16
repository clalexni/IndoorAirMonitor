package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

class PeakFlowRepository(private val dataSource: PeakFlowDataSource) {

    fun getPeakFlow() = dataSource.getPeakFlow()
    fun setPeakFlow(peakFlow: Double) = dataSource.setPeakFlow(peakFlow)

}
package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

interface PeakFlowDataSource{
    suspend fun getPeakFlow(): Double
    suspend fun setPeakFlow(peakFlow: Double)
}
package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

interface PeakFlowDataSource{
    fun getPeakFlow(): Double
    fun setPeakFlow(peakFlow: Double)
}

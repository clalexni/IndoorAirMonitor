package com.utd.indoorairmonitor.framework.peakflow

import com.utd.indoorairmonitor.data.PeakFlowDataSource
import com.utd.indoorairmonitor.domain.PeakFlow

class PeakFlowDataSourceImp: PeakFlowDataSource {

    private var pf: PeakFlow = PeakFlow(0.0)

    override fun getPeakFlow(): Double {
        return pf.peakFlow
    }

    override fun setPeakFlow(peakFlow: Double) {
        pf.peakFlow = peakFlow
    }

}
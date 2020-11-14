package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.PeakFlow

interface PeakFlowDataSource{

    suspend fun read(peakFlow: PeakFlow): PeakFlow

}
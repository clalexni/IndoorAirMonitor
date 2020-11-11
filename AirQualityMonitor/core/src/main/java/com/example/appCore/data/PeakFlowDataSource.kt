package com.example.appCore.data

import com.example.appCore.domain.PeakFlow

interface PeakFlowDataSource{

    suspend fun read(peakFlow: PeakFlow): PeakFlow

}
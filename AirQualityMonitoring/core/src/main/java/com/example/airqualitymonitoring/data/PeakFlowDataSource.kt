package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.PeakFlow

interface PeakFlowDataSource{

    suspend fun add(peakFlow: PeakFlow)

    suspend fun read(peakFlow: PeakFlow): List<PeakFlow>

    suspend fun remove(peakFlow: PeakFlow)

}
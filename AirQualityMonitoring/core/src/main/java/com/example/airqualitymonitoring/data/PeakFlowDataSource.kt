package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.PeakFlow

interface PeakFlowDataSource{

    suspend fun read(peakFlow: PeakFlow): PeakFlow

}
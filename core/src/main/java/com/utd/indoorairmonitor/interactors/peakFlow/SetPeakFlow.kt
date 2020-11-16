package com.utd.indoorairmonitor.interactors.peakFlow

import com.utd.indoorairmonitor.data.PeakFlowRepository

class SetPeakFlow (private val peakFlowRepository: PeakFlowRepository)
{
    suspend operator fun invoke(peakFlow: Double) =
            peakFlowRepository.setPeakFlow(peakFlow)
}
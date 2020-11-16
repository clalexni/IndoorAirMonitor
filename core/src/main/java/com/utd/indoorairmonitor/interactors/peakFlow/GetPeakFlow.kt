package com.utd.indoorairmonitor.interactors.peakFlow

import com.utd.indoorairmonitor.data.PeakFlowRepository

class GetPeakFlow (private val peakFlowRepository: PeakFlowRepository) {
    suspend operator fun invoke() =
        peakFlowRepository.getPeakFlow()
}
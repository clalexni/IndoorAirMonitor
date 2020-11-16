package com.utd.indoorairmonitor.interactors.peakFlow

import com.utd.indoorairmonitor.data.PeakFlowRepository

class GetPeakFlow (private val peakFlowRepository: PeakFlowRepository) {
    operator fun invoke() =
        peakFlowRepository.getPeakFlow()
}
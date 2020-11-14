package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.PeakFlowRepository
import com.utd.indoorairmonitor.domain.PeakFlow

class GetPeakFlow (private val peakFlowRepository: PeakFlowRepository) {
    suspend operator fun invoke(peakFlow: PeakFlow) =
        peakFlowRepository.getPeakFlow(peakFlow)
}
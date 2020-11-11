package com.example.appCore.interactors

import com.example.appCore.data.PeakFlowRepository
import com.example.appCore.domain.PeakFlow

class GetPeakFlow (private val peakFlowRepository: PeakFlowRepository) {
    suspend operator fun invoke(peakFlow: PeakFlow) =
        peakFlowRepository.getPeakFlow(peakFlow)
}
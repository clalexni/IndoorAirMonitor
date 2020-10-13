package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.PeakFlowRepository
import com.example.airqualitymonitoring.domain.PeakFlow

class GetPeakFlow (private val peakFlowRepository: PeakFlowRepository) {
    suspend operator fun invoke(peakFlow: PeakFlow) =
        peakFlowRepository.getPeakFlow(peakFlow)
}
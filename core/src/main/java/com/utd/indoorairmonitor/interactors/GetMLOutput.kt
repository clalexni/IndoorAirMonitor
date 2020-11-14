package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.MLOutputRepository
import com.utd.indoorairmonitor.domain.MLOutput

class GetMLOutput (private val mlOutputRepository: MLOutputRepository) {
    suspend operator fun invoke() = mlOutputRepository.getMLOutput()
}
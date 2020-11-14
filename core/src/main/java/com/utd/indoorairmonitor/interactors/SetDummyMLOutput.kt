package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.MLOutputRepository
import com.utd.indoorairmonitor.domain.MLOutput

class SetDummyMLOutput(private val mlOutputRepository: MLOutputRepository) {
    suspend operator fun invoke(dummyOutput: String) =
            mlOutputRepository.setDummyMLOutput(dummyOutput)
}
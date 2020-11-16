package com.utd.indoorairmonitor.interactors.mlModel

import com.utd.indoorairmonitor.data.MLModelRepository

class GetMLResults (private val mlModelRepository: MLModelRepository) {
    operator fun invoke() =
            mlModelRepository.getMLResults()
}
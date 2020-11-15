package com.utd.indoorairmonitor.interactors.mlModel

import com.utd.indoorairmonitor.data.MLModelRepository

class GetMLOutput1(private val mlModelRepository: MLModelRepository) {
    operator fun invoke() =
            mlModelRepository.getMLOutput1()
}
package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLOutputRepository

class GetMLOutput1(private val mlOutputRepository: MLOutputRepository) {
    operator fun invoke() =
            mlOutputRepository.getMLOutput1()
}
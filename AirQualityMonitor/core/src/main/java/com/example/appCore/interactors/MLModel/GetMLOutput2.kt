package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLOutputRepository

class GetMLOutput2(private val mlOutputRepository: MLOutputRepository) {
    operator fun invoke() =
            mlOutputRepository.getMLOutput2()
}
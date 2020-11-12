package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLModelRepository

class GetMLOutput2(private val mlModelRepository: MLModelRepository) {
    operator fun invoke() =
            mlModelRepository.getMLOutput2()
}
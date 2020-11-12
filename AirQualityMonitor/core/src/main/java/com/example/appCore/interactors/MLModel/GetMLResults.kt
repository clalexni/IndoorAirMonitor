package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLModelRepository

class GetMLResults (private val mlModelRepository: MLModelRepository) {
    operator fun invoke() =
        mlModelRepository.getMLResults()
}
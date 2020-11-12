package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLOutputRepository

class GetMLResults (private val mlOutputRepository: MLOutputRepository) {
    operator fun invoke() =
        mlOutputRepository.getMLResults()
}
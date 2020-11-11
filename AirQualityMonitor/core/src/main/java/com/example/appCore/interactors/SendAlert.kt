package com.example.appCore.interactors

import com.example.appCore.data.MLOutputRepository
import com.example.appCore.domain.MLOutput

class SendAlert (private val mlOutputRepository: MLOutputRepository) {
    suspend operator fun invoke(mlOutput: MLOutput) =
        mlOutputRepository.sendAlert(mlOutput)
}
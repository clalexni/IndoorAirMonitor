package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.MLOutputRepository
import com.example.airqualitymonitoring.domain.MLOutput

class SendAlert (private val mlOutputRepository: MLOutputRepository) {
    suspend operator fun invoke(mlOutput: MLOutput) =
        mlOutputRepository.sendAlert(mlOutput)
}
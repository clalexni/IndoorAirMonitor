package com.example.appCore.interactors.MLModel

import com.example.appCore.data.MLModelRepository

class PredictMLResults(private val mlModelRepository: MLModelRepository) {
    operator fun invoke(temperature: Double, humidity: Int, pm2_5: Double, pm10_0: Double) =
            mlModelRepository.predictMLResults(temperature, humidity, pm2_5, pm10_0)
}
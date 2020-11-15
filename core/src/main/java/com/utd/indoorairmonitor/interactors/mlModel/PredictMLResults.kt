package com.utd.indoorairmonitor.interactors.mlModel

import com.utd.indoorairmonitor.data.MLModelRepository

class PredictMLResults(private val mlModelRepository: MLModelRepository) {
    operator fun invoke(temperature: Double, humidity: Int, pm2_5: Double, pm10_0: Double) =
            mlModelRepository.predictMLResults(temperature, humidity, pm2_5, pm10_0)
}

//Project clean
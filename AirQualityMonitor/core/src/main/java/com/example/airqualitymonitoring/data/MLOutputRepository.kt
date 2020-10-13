package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.MLOutput

class MLOutputRepository(private val dataSource: MLOutputDataSource) {

    suspend fun getMLOutput(mlOutput: MLOutput) {
        dataSource.read(mlOutput)
    }

    suspend fun sendAlert(mlOutput: MLOutput) {
        dataSource.send(mlOutput)
    }
}
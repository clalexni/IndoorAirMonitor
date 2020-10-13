package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.MLOutput

interface MLOutputDataSource {

    suspend fun read(mlOutput: MLOutput): MLOutput

    suspend fun send(mlOutput: MLOutput): MLOutput

}
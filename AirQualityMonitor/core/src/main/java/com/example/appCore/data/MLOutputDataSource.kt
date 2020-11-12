package com.example.appCore.data

import com.example.appCore.domain.MLOutput

interface MLOutputDataSource {

    suspend fun read(mlOutput: MLOutput): MLOutput

    suspend fun send(mlOutput: MLOutput): MLOutput

}
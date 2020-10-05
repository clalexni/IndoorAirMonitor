package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.RawData

interface RawDataDataSource {

    suspend fun add(rawData: RawData)

    suspend fun read(rawData: RawData): List<RawData>

    suspend fun remove(rawData: RawData)

}
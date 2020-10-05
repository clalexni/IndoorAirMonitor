package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.AirQuality

interface AirQualityDataSource {

    suspend fun add(airQuality: AirQuality)

    suspend fun read(airQuality: AirQuality): List<AirQuality>

    suspend fun remove(airQuality: AirQuality)

}
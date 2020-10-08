package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.AirQuality

interface AirQualityDataSource {

    suspend fun read(airQuality: AirQuality): AirQuality

}
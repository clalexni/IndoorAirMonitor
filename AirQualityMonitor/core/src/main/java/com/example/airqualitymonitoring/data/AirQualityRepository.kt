package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.AirQuality

class AirQualityRepository(private val dataSource: AirQualityDataSource) {

    suspend fun getAirQuality(airQuality: AirQuality) {
        dataSource.read(airQuality)
    }

}
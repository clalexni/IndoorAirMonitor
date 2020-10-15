package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.AirQuality

class AirQualityRepository(private val dataSource: AirQualityDataSource) {

    suspend fun read() = dataSource.read()

    suspend fun readPM2_5(): Double
    {
        return dataSource.readPM2_5()
    }

    suspend fun readPM10_0(): Double
    {
        return dataSource.readPM10_0()
    }

    suspend fun setDeviceName(name: String) = dataSource.setDeviceName(name)

}
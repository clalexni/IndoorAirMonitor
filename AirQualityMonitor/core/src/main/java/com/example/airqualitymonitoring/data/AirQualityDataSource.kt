package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.AirQuality

interface AirQualityDataSource {

    suspend fun updateAirMonitor(): AirQuality

    suspend fun getPM2_5(): Double

    suspend fun getPM10_0(): Double

    fun setDeviceName(name: String)

}
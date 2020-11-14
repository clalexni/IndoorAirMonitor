package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.AirQuality

interface AirQualityDataSource {

    suspend fun read(): AirQuality

    suspend fun readPM2_5(): Double

    suspend fun readPM10_0(): Double

    suspend fun setDeviceName(name: String)

}
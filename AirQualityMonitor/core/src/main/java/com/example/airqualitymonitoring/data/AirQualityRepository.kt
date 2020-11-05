package com.example.airqualitymonitoring.data

class AirQualityRepository(private val dataSource: AirQualityDataSource) {

    suspend fun read() = dataSource.updateAirMonitor()

    suspend fun readPM2_5(): Double
    {
        return dataSource.getPM2_5()
    }

    suspend fun readPM10_0(): Double
    {
        return dataSource.getPM10_0()
    }

    suspend fun setDeviceName(name: String) = dataSource.setDeviceName(name)

}
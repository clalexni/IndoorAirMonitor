package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Weather

interface WeatherDataSource {

    suspend fun add(weather: Weather)

    suspend fun read(weather: Weather): List<Weather>

    suspend fun remove(weather: Weather)

}
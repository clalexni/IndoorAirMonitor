package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Weather

interface WeatherDataSource {

    suspend fun read(weather: Weather): Weather

}
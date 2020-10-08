package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Weather

class WeatherRepository (private val dataSource: WeatherDataSource) {

    suspend fun getWeather(weather: Weather) {
        dataSource.read(weather)
    }

}
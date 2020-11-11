package com.example.appCore.data

import com.example.appCore.domain.Weather

class WeatherRepository (private val dataSource: WeatherDataSource) {

    suspend fun getWeather(weather: Weather) {
        dataSource.read(weather)
    }

}
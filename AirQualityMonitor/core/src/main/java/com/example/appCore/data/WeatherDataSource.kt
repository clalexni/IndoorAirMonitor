package com.example.appCore.data

import com.example.appCore.domain.Weather

interface WeatherDataSource {

    suspend fun read(weather: Weather): Weather

}
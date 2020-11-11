package com.example.appCore.data

import com.example.appCore.domain.Weather

interface WeatherDataSource {

    suspend fun updateWeather(): Weather

    fun getTemp() : Float

    fun getHumidity() : Float

    fun setZipCode(zipCode: Int)
}
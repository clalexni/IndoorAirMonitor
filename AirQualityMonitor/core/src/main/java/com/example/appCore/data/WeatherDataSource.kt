package com.example.appCore.data

import com.example.appCore.domain.Weather

interface WeatherDataSource {

    suspend fun updateWeather(): Weather

    fun getTemp() : Double

    fun getHumidity() : Int

    fun setZipCode(zipCode: String)
}
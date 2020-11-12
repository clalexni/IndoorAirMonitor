package com.example.appCore.interactors.Weather

import com.example.appCore.data.WeatherRepository

class UpdateWeather (private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke() =
            weatherRepository.updateWeather()
}
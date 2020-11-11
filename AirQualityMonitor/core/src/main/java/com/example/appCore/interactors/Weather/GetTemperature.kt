package com.example.appCore.interactors.Weather

import com.example.appCore.data.WeatherRepository

class GetTemperature (private val weatherRepository: WeatherRepository) {
    operator fun invoke() =
            weatherRepository.getTemp()
}
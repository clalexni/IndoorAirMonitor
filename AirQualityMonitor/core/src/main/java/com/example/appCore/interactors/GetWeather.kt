package com.example.appCore.interactors

import com.example.appCore.data.WeatherRepository
import com.example.appCore.domain.Weather

class GetWeather (private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(weather: Weather) =
        weatherRepository.getWeather(weather)
}
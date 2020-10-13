package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.WeatherRepository
import com.example.airqualitymonitoring.domain.Weather

class GetWeather (private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(weather: Weather) =
        weatherRepository.getWeather(weather)
}
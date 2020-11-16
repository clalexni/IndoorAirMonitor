package com.utd.indoorairmonitor.interactors.weather

import com.utd.indoorairmonitor.data.WeatherRepository

class UpdateWeather (private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke() =
            weatherRepository.updateWeather()
}
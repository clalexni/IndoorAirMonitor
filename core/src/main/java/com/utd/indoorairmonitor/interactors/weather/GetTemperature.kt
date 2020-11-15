package com.utd.indoorairmonitor.interactors.weather

import com.utd.indoorairmonitor.data.WeatherRepository

class GetTemperature (private val weatherRepository: WeatherRepository) {
    operator fun invoke() =
            weatherRepository.getTemp()
}
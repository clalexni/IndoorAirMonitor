package com.utd.indoorairmonitor.interactors.weather

import com.utd.indoorairmonitor.data.WeatherRepository

class GetHumidity (private val weatherRepository: WeatherRepository) {
    operator fun invoke() =
            weatherRepository.getHumidity()
}
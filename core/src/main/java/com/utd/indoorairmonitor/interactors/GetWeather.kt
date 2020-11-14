package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.WeatherRepository
import com.utd.indoorairmonitor.domain.Weather

class GetWeather (private val weatherRepository: WeatherRepository) {
    suspend operator fun invoke(weather: Weather) =
        weatherRepository.getWeather(weather)
}
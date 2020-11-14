package com.utd.indoorairmonitor.data
import com.utd.indoorairmonitor.domain.Weather

class WeatherRepository (private val dataSource: WeatherDataSource) {

    suspend fun getWeather(weather: Weather) {
        dataSource.read(weather)
    }

}
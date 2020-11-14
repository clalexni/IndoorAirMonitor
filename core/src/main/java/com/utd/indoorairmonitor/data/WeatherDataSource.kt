package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.Weather

interface WeatherDataSource {

    suspend fun read(weather: Weather): Weather

}
package com.utd.indoorairmonitor.data
class WeatherRepository (private val dataSource: WeatherDataSource) {

    suspend fun updateWeather() = dataSource.updateWeather()

    fun getTemp() = dataSource.getTemp()

    fun getHumidity() = dataSource.getHumidity()

    fun setZipCode(zipCode: String) = dataSource.setZipCode(zipCode)
}

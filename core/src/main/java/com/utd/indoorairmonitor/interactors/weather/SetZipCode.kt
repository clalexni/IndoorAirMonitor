package com.utd.indoorairmonitor.interactors.weather

import com.utd.indoorairmonitor.data.WeatherRepository

class SetZipCode (private val weatherRepository: WeatherRepository)
{
    operator fun invoke(zipCode: String) =
            weatherRepository.setZipCode(zipCode)
}
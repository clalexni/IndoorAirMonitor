package com.example.appCore.interactors.Weather

import com.example.appCore.data.WeatherRepository

class SetZipCode (private val weatherRepository: WeatherRepository)
{
    operator fun invoke(zipCode: String) =
            weatherRepository.setZipCode(zipCode)
}
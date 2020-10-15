package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.AirQualityRepository

class ReadPM10_0 (private val airQualityRepository: AirQualityRepository)
{
    suspend operator fun invoke() =
            airQualityRepository.readPM2_5()
}
package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.AirQualityRepository

class ReadPM10_0 (private val airQualityRepository: AirQualityRepository)
{
    suspend operator fun invoke() =
            airQualityRepository.readPM2_5()
}
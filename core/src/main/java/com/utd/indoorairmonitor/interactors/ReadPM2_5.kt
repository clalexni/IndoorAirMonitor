package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.AirQualityRepository

class ReadPM2_5 (private val airQualityRepository: AirQualityRepository)
{
    suspend operator fun invoke() =
            airQualityRepository.readPM2_5()
}
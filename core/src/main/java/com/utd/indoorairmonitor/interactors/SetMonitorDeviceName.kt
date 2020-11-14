package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.AirQualityRepository

class SetMonitorDeviceName (private val airQualityRepository: AirQualityRepository)
{
    suspend operator fun invoke(name: String) =
            airQualityRepository.setDeviceName(name)
}
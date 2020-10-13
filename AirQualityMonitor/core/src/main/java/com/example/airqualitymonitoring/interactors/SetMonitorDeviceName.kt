package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.AirQualityRepository

class SetMonitorDeviceName (private val airQualityRepository: AirQualityRepository)
{
    suspend operator fun invoke(name: String) =
            airQualityRepository.setDeviceName(name)
}
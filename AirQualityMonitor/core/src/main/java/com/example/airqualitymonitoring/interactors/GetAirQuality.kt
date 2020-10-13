package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.AirQualityRepository
import com.example.airqualitymonitoring.domain.AirQuality

class GetAirQuality (private val airQualityRepository: AirQualityRepository) {
    suspend operator fun invoke(airQuality: AirQuality) =
        airQualityRepository.getAirQuality(airQuality)
}
package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.AirQualityRepository
import com.utd.indoorairmonitor.domain.AirQuality

class ReadAirQuality (private val airQualityRepository: AirQualityRepository) {
    suspend operator fun invoke() =
        airQualityRepository.read()
}
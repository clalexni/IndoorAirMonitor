package com.example.appCore.interactors

import com.example.appCore.data.AirMonitorRepository

class UpdateAirMonitor (private val airMonitorRepository: AirMonitorRepository) {
    suspend operator fun invoke() =
        airMonitorRepository.updateAirMonitor()
}
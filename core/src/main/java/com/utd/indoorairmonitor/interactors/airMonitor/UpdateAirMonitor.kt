package com.utd.indoorairmonitor.interactors.airMonitor

import com.utd.indoorairmonitor.data.AirMonitorRepository

class UpdateAirMonitor (private val airMonitorRepository: AirMonitorRepository) {
    suspend operator fun invoke() =
        airMonitorRepository.updateAirMonitor()
}
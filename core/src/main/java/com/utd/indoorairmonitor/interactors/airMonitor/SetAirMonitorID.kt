package com.utd.indoorairmonitor.interactors.airMonitor

import com.utd.indoorairmonitor.data.AirMonitorRepository

class SetAirMonitorID (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke(id: String) =
            airMonitorRepository.setID(id)
}
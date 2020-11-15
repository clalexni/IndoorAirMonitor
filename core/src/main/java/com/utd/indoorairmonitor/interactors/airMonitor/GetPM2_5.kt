package com.utd.indoorairmonitor.interactors.airMonitor

import com.utd.indoorairmonitor.data.AirMonitorRepository

class GetPM2_5 (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke() =
            airMonitorRepository.getPM2_5()
}
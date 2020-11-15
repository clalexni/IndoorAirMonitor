package com.utd.indoorairmonitor.interactors.airMonitor

import com.utd.indoorairmonitor.data.AirMonitorRepository

class GetPM10_0 (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke() =
            airMonitorRepository.getPM10_0()
}
package com.example.appCore.interactors.AirMonitor

import com.example.appCore.data.AirMonitorRepository

class GetPM2_5 (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke() =
            airMonitorRepository.getPM2_5()
}
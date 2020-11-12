package com.example.appCore.interactors.AirMonitor

import com.example.appCore.data.AirMonitorRepository

class GetPM10_0 (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke() =
            airMonitorRepository.getPM10_0()
}
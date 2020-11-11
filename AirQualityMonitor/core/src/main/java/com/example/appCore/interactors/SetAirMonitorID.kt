package com.example.appCore.interactors

import com.example.appCore.data.AirMonitorRepository

class SetAirMonitorID (private val airMonitorRepository: AirMonitorRepository)
{
    operator fun invoke(id: String) =
            airMonitorRepository.setID(id)
}
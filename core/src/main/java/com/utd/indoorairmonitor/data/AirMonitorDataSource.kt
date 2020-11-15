package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.AirMonitor

interface AirMonitorDataSource {

    suspend fun updateAirMonitor(): AirMonitor

    fun getPM2_5(): Double

    fun getPM10_0(): Double

    fun setID(id: String)

}
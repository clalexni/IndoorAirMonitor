package com.utd.indoorairmonitor.framework

import com.utd.indoorairmonitor.interactors.*

data class Interactors(
        val readAirQuality: ReadAirQuality,
        val readPM2_5: ReadPM2_5,
        val readPM10_0: ReadPM10_0,
        val setMonitorDeviceName: SetMonitorDeviceName,
        val getMLOutput: GetMLOutput,
        val setDummyMLOutput: SetDummyMLOutput
)

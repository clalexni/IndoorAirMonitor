package com.utd.indoorairmonitor.domain

//Should ID be part of AirMonitor? Yes it should as it is hard to seperate
//setID from interactors usecase.
data class AirMonitor(var ID: String, var pm2_5: Double, var pm10_0: Double) {
}
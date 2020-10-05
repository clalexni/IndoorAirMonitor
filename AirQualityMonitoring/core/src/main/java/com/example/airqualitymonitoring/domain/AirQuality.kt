package com.example.airqualitymonitoring.domain

import java.time.LocalDateTime

data class AirQuality(val airQuality: Float,
                      val localDateTime: LocalDateTime) {
}
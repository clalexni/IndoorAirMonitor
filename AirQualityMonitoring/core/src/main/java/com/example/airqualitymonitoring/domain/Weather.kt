package com.example.airqualitymonitoring.domain

import java.time.LocalDateTime

data class Weather(val temperature: Float,
                   val humidity: Float,
                   val localDateTime: LocalDateTime) {
}
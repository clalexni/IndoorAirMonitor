package com.example.airqualitymonitoring.domain

import java.time.LocalDateTime

data class Questionnaire(val answers: IntArray,
                         val localDateTime: LocalDateTime) {
}
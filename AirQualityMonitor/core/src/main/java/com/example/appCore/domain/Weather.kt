package com.example.appCore.domain

//Temperature in *C
data class Weather(val zipCode: Int, val temperature: Float,
                   val humidity: Float) {
}

package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.MLModel

interface MLModelDataSource {

    fun predictMLResults(temperature: Double, humidity: Int, pm2_5: Double, pm10_0: Double)

    fun getMLResults() : MLModel

    fun getMLOutput1() : Double

    fun getMLOutput2() : Double

}
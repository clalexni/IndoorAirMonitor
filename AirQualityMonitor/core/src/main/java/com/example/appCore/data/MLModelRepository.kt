package com.example.appCore.data

class MLModelRepository(private val dataSource: MLModelDataSource) {

    fun predictMLResults(temperature: Double, humidity: Int, pm2_5: Double, pm10_0: Double) =
            dataSource.predictMLResults(temperature, humidity, pm2_5, pm10_0)
    fun getMLResults() = dataSource.getMLResults()

    fun getMLOutput1() = dataSource.getMLOutput1()

    fun getMLOutput2() = dataSource.getMLOutput2()

}
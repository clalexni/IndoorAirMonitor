package com.example.appCore.data

import com.example.appCore.domain.MLOutput

class MLOutputRepository(private val dataSource: MLOutputDataSource) {

    fun getMLResults() = dataSource.getMLResults()

    fun getMLOutput1() = dataSource.getMLOutput1()

    fun getMLOutput2() = dataSource.getMLOutput2()

}
package com.example.appCore.data

import com.example.appCore.domain.MLOutput

interface MLOutputDataSource {

    fun getMLResults() : MLOutput

    fun getMLOutput1() : Double

    fun getMLOutput2() : Double

}
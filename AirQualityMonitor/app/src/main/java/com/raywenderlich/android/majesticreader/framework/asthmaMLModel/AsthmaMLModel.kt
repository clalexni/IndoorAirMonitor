package com.raywenderlich.android.majesticreader.framework.asthmaMLModel

import com.example.appCore.data.MLModelDataSource
import com.example.appCore.domain.MLModel

class AsthmaMLModel: MLModelDataSource {
    private val mlModel = MLModel(0.0,0.0)

    override fun getMLResults() = mlModel

    override fun getMLOutput1() = mlModel.output1

    override fun getMLOutput2() = mlModel.output2

    override fun predictMLResults(temperature: Double, humidity: Int, pm2_5: Double, pm10_0: Double) {

    }

}
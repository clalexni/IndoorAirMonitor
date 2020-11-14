package com.utd.indoorairmonitor.framework

import com.utd.indoorairmonitor.data.MLOutputDataSource
import com.utd.indoorairmonitor.domain.MLOutput

class MLOutputDataSourceImpl: MLOutputDataSource{

    private var mlOutput: MLOutput = MLOutput("green") //TODO

    override suspend fun read(): MLOutput {
        return mlOutput
    }

    override suspend fun setDummyOutput(dummyOutput: String) {
        mlOutput.output = dummyOutput
    }
}
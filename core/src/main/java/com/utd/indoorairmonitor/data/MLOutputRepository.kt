package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.MLOutput

class MLOutputRepository(private val dataSource: MLOutputDataSource) {

    suspend fun getMLOutput() = dataSource.read()
    suspend fun setDummyMLOutput(fakeMLOutput: String) = dataSource.setDummyOutput(fakeMLOutput)
}
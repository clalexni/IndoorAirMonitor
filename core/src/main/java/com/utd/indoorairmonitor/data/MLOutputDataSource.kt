package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.MLOutput

interface MLOutputDataSource {

    suspend fun read(): MLOutput
    suspend fun setDummyOutput(dummyOutput: String)

}
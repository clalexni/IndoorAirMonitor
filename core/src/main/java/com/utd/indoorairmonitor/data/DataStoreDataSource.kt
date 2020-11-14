package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.DataStore

interface DataStoreDataSource {

    suspend fun add(dataStore: DataStore)

    suspend fun read(dataStore: DataStore): List<DataStore>

    suspend fun remove(dataStore: DataStore)

}
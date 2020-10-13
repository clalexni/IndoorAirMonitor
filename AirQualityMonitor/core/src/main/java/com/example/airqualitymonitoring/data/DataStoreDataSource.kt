package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.DataStore

interface DataStoreDataSource {

    suspend fun add(dataStore: DataStore)

    suspend fun read(dataStore: DataStore): List<DataStore>

    suspend fun remove(dataStore: DataStore)

}
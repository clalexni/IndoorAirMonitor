package com.example.appCore.data

import com.example.appCore.domain.DataStore

interface DataStoreDataSource {

    suspend fun add(dataStore: DataStore)

    suspend fun read(dataStore: DataStore): List<DataStore>

    suspend fun remove(dataStore: DataStore)

}
package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.DataStore

class DataStoreRepository(private val dataSource: DataStoreDataSource) {

    suspend fun addDataStore(dataStore: DataStore) {
        dataSource.add(dataStore)
    }

    suspend fun getDataStores(dataStore: DataStore) {
        dataSource.read(dataStore)
    }

    suspend fun removeDataStore(dataStore: DataStore) {
        dataSource.remove(dataStore)
    }
}
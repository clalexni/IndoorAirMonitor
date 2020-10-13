package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.DataStoreRepository
import com.example.airqualitymonitoring.domain.DataStore

class GetDataStore (private val dataStoreRepository: DataStoreRepository) {
    suspend operator fun invoke(dataStore: DataStore) =
        dataStoreRepository.getDataStores(dataStore)
}
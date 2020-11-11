package com.example.appCore.interactors

import com.example.appCore.data.DataStoreRepository
import com.example.appCore.domain.DataStore

class AddDataStore (private val dataStoreRepository: DataStoreRepository) {
    suspend operator fun invoke(dataStore: DataStore) =
        dataStoreRepository.addDataStore(dataStore)
}
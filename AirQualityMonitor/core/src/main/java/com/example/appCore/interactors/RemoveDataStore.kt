package com.example.appCore.interactors

import com.example.appCore.data.DataStoreRepository
import com.example.appCore.domain.DataStore

class RemoveDataStore (private val dataStoreRepository: DataStoreRepository) {
    suspend operator fun invoke(dataStore: DataStore) =
        dataStoreRepository.removeDataStore(dataStore)
}
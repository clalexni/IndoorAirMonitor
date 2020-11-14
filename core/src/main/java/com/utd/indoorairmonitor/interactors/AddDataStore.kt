package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.DataStoreRepository
import com.utd.indoorairmonitor.domain.DataStore

class AddDataStore (private val dataStoreRepository: DataStoreRepository) {
    suspend operator fun invoke(dataStore: DataStore) =
        dataStoreRepository.addDataStore(dataStore)
}
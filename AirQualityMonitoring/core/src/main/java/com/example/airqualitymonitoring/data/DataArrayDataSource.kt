package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.DataArray

interface DataArrayDataSource {

    suspend fun add(dataArray: DataArray)

    suspend fun read(dataArray: DataArray): List<DataArray>

    suspend fun remove(dataArray: DataArray)

}
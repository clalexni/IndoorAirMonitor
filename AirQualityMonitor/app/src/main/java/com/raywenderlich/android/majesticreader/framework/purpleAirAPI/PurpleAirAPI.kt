package com.raywenderlich.android.majesticreader.framework.purpleAirAPI

import com.raywenderlich.android.majesticreader.framework.purpleAirAPI.Model.MonitorResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//Needs to be used in MVVM ViewModel.
interface PurpleAirApi {

    @GET("data.json/")
    fun getAllDataPoints() : Call<MonitorResponse>

    @GET("data.json/")
    fun getDataPoint(
            @Query("show") deviceID: String
    ) : Call<MonitorResponse>
}
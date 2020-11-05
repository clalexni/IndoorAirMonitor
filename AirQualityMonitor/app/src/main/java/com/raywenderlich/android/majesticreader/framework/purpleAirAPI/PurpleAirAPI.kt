package com.raywenderlich.android.majesticreader.framework.purpleAirAPI

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.raywenderlich.android.majesticreader.framework.purpleAirAPI.Model.MonitorResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

//Needs to be used in MVVM ViewModel.
interface PurpleAirApi {

    @GET("json/")
    @Headers("Content-Type: application/json")
    fun getAllDataPoints() : Call<MonitorResponse>


    @GET("json/")
    @Headers("Content-Type: application/json")
    fun getDataPoint(
            @Query("show") deviceID: String
    ) : Call<JsonElement>


    companion object{
        operator fun invoke(): PurpleAirApi{

            val gson = GsonBuilder().setLenient().create()
            return Retrofit.Builder()
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl("https://www.purpleair.com/")
                    .build()
                    .create(PurpleAirApi::class.java)
        }
    }
}
package com.raywenderlich.android.majesticreader.framework.OpenWeather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import com.raywenderlich.android.majesticreader.framework.OpenWeather.Model.OpenWeatherModel

interface OpenWeatherRetrofit {

    //temp is given in Kelvin must be turned to Celsius.
    @GET("data/2.5/weather")
    fun getWeatherData(
            @Query("zip") zipCode: String,
            @Query("appid") app_id: String
    ): Call<OpenWeatherModel>

    //An appid 5e6528a80e5479b2d769ef5801c6b122
    companion object{
        operator fun invoke(): OpenWeatherRetrofit{

            return Retrofit.Builder()
                    .baseUrl("http://api.openweathermap.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(OpenWeatherRetrofit::class.java)
        }
    }
}
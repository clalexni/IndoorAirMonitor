package com.raywenderlich.android.majesticreader.framework.OpenWeather

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import com.example.appCore.data.WeatherDataSource
import com.example.appCore.domain.Weather
import com.raywenderlich.android.majesticreader.framework.OpenWeather.Model.OpenWeatherModel

class OpenWeatherAPI: WeatherDataSource {
    private var openWeather = Weather("75035", 0.0,0)
    private val APIKEY = "5e6528a80e5479b2d769ef5801c6b122"

    override fun getTemp() = openWeather.temperature

    override fun getHumidity() = openWeather.humidity

    override fun setZipCode(zipCode: String) {
        openWeather.zipCode = zipCode
    }

    private val openWeatherApi = OpenWeatherRetrofit.invoke()

    override suspend fun updateWeather(): Weather {
        val openWeatherApiCall = openWeatherApi.getWeatherData(openWeather.zipCode, APIKEY)

        openWeatherApiCall.enqueue(object: Callback<OpenWeatherModel> {
            override fun onFailure(call: Call<OpenWeatherModel>, t: Throwable) {
                Log.e("ERROR", t.message.toString())
            }

            override fun onResponse(call: Call<OpenWeatherModel>, response: Response<OpenWeatherModel>) {
                if (response.isSuccessful){
                    //instead use OpenWeatherModel? and null check and assign.
                    val body : OpenWeatherModel = response.body()!!
                    openWeather.humidity = body.main.humidity
                    val kelvin = body.main.temp
                    openWeather.temperature = (kelvin - 273.15) * 1.8 + 32 //fahrenheit
                }
                else{
                    Log.e("ERROR", response.errorBody().toString())
                }
            }
        })

        return openWeather
    }
}
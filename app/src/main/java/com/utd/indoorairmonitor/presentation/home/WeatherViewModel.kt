package com.utd.indoorairmonitor.presentation.weather

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.utd.indoorairmonitor.domain.Weather
import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherViewModel(application: Application, interactors: Interactors)
    : IndoorAirMonitorViewModel(application, interactors)
{

    private val _humidity = MutableLiveData<Int>(0)
    private val _temperature = MutableLiveData<Double>(0.0)
    private val _weather = MutableLiveData<Weather>(Weather("0",0.0,0))

    val humidity : LiveData<Int>
        get() = _humidity
    val temperature : LiveData<Double>
        get() = _temperature
    val weather : LiveData<Weather>
        get() = _weather

    fun setZipCode(zipCode: String) = interactors.setZipCode(zipCode)

    fun updateWeather() {
        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                _weather.postValue(interactors.updateWeather())
            }

            _humidity.postValue(_weather.value!!.humidity)
            _temperature.postValue(_weather.value!!.temperature)
        }
    }
}
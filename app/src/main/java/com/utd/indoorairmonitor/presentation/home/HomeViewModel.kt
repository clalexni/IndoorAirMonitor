package com.utd.indoorairmonitor.presentation.home

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utd.indoorairmonitor.domain.AirMonitor
import com.utd.indoorairmonitor.domain.Weather

import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeViewModel(application: Application, interactors: Interactors):
    IndoorAirMonitorViewModel(application, interactors){

    //peak flow meter private field
    private val _pefr = MutableLiveData<Double>(0.0)

    // air monitor related private fields
    private val _pm2_5 = MutableLiveData<Double>(0.0)
    private val _pm10_0 = MutableLiveData<Double>(0.0)
    private val _airMonitor = MutableLiveData<AirMonitor>(AirMonitor("0",0.0,0.0))

    // ml model related private fields
    private val _output1 = MutableLiveData<Double>(0.0)
    private val _output2 = MutableLiveData<Double>(0.0)

    // weather related private fields
    private val _humidity = MutableLiveData<Int>(0)
    private val _temperature = MutableLiveData<Double>(0.0)
    private val _weather = MutableLiveData<Weather>(Weather("0",0.0,0))

    // peak flow meter getter
    val pefr: LiveData<Double>
        get() = _pefr

    // air monitor related private fields getters
    val pm2_5 : LiveData<Double>
        get() = _pm2_5
    val pm10_0 : LiveData<Double>
        get() = _pm10_0
    val airMonitor : LiveData<AirMonitor>
        get() = _airMonitor

    // ml model related private fields getters
    val output1 : LiveData<Double>
        get() = _output1
    val output2 : LiveData<Double>
        get() = _output2

    // weather related private fields getter
    val humidity : LiveData<Int>
        get() = _humidity
    val temperature : LiveData<Double>
        get() = _temperature
    val weather : LiveData<Weather>
        get() = _weather

    // peak flow meter setter


    // air monitor related functions
    fun setDeviceName(name: String) = interactors.setAirMonitorID(name)

    fun updateAirMonitor()
    {
        GlobalScope.launch {
            //Dispatchers.IO is optimized for Network requests.
            withContext(Dispatchers.IO) {
                _airMonitor.postValue(interactors.updateAirMonitor())
            }

            //!! is bad practice.
            _pm2_5.postValue(_airMonitor.value!!.pm2_5)
            _pm10_0.postValue(_airMonitor.value!!.pm10_0)
        }
    }

    // ml model related functions
    fun predictMLResults(){
        val temp = interactors.getTemperature()
        val humidity = interactors.getHumidity()
        val pm2_5 = interactors.getPM2_5()
        val pm10_0 = interactors.getPM10_0()

        interactors.predictMLResults(temp, humidity, pm2_5, pm10_0)

        _output1.postValue(interactors.getMLOutput1())
        _output2.postValue(interactors.getMLOutput2())
    }

    // weather related functions
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
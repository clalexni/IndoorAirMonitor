package com.raywenderlich.android.majesticreader.presentation.airQuality

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.airqualitymonitoring.domain.AirQuality
import com.raywenderlich.android.majesticreader.framework.Interactors
import com.raywenderlich.android.majesticreader.framework.MajesticViewModel
import kotlinx.coroutines.*

class AirQualityViewModel(application: Application, interactors: Interactors)
    : MajesticViewModel(application, interactors) {

    val pm2_5 = MutableLiveData<Double>()
    val pm10_0 = MutableLiveData<Double>()
    val airQuality = MutableLiveData<AirQuality>()

    fun readAirQuality()
    {
        GlobalScope.launch {
            async {
                airQuality.postValue(interactors.readAirQuality())
            }.await()
            pm2_5.postValue(airQuality.value!!.pm2_5)
            pm10_0.postValue(airQuality.value!!.pm10_0)
        }
    }

    fun getPM2_5() {
            GlobalScope.launch(Dispatchers.Main) {
            pm2_5.postValue(interactors.readPM2_5())
        }
    }
    fun getPM10_0() {
        GlobalScope.launch {
            pm10_0.postValue(interactors.readPM10_0())
        }
    }

    fun setDeviceName(name: String)
    {
        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                interactors.setMonitorDeviceName(name)
            }
        }
    }
}
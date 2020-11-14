package com.utd.indoorairmonitor.presentation.home

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.utd.indoorairmonitor.domain.AirQuality
import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AirQualityViewModel(application: Application, interactors: Interactors)
    : IndoorAirMonitorViewModel(application, interactors) {

    val pm2_5 = MutableLiveData<Double>()
    val pm10_0 = MutableLiveData<Double>()
    val airQuality = MutableLiveData<AirQuality>()

    fun readAirQuality()
    {
        GlobalScope.launch {
            airQuality.postValue(interactors.readAirQuality())
        }
    }

    fun readPM2_5() {
        GlobalScope.launch {
            pm2_5.postValue(interactors.readPM2_5())
        }
    }
    fun readPM10_0() {
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
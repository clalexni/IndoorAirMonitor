package com.utd.indoorairmonitor.presentation.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel


class MLModelViewModel(application: Application, interactors: Interactors)
    : IndoorAirMonitorViewModel(application, interactors){
    private val _output1 = MutableLiveData<Double>(0.0)
    private val _output2 = MutableLiveData<Double>(0.0)

    val output1 : LiveData<Double>
        get() = _output1
    val output2 : LiveData<Double>
        get() = _output2

    fun predictMLResults(){
        val temp = interactors.getTemperature()
        val humidity = interactors.getHumidity()
        val pm2_5 = interactors.getPM2_5()
        val pm10_0 = interactors.getPM10_0()

        interactors.predictMLResults(temp, humidity, pm2_5, pm10_0)

        _output1.postValue(interactors.getMLOutput1())
        _output2.postValue(interactors.getMLOutput2())
    }
}
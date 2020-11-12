package com.raywenderlich.android.majesticreader.presentation.airMonitor

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.appCore.domain.AirMonitor
import com.raywenderlich.android.majesticreader.framework.Interactors
import com.raywenderlich.android.majesticreader.framework.MajesticViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AirMonitorViewModel(application: Application, interactors: Interactors)
    : MajesticViewModel(application, interactors)
{

    private val _pm2_5 = MutableLiveData<Double>(0.0)
    private val _pm10_0 = MutableLiveData<Double>(0.0)
    private val _airMonitor = MutableLiveData<AirMonitor>(AirMonitor("0",0.0,0.0))

    val pm2_5 : LiveData<Double>
        get() = _pm2_5
    val pm10_0 : LiveData<Double>
        get() = _pm10_0
    val airMonitor : LiveData<AirMonitor>
        get() = _airMonitor

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
}
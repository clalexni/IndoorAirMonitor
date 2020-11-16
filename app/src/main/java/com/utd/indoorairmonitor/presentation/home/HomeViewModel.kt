package com.utd.indoorairmonitor.presentation.home

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel


class HomeViewModel(application: Application, interactors: Interactors):
    IndoorAirMonitorViewModel(application, interactors){

    init {
        Log.i("HomeViewModel", "HomwViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("HomeViewModel", "HomeViewModel destroyed!")
    }



}
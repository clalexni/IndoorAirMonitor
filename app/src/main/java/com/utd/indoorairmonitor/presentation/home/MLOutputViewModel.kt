package com.utd.indoorairmonitor.presentation.home

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.utd.indoorairmonitor.domain.MLOutput
import com.utd.indoorairmonitor.framework.Interactors
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MLOutputViewModel(application: Application, interactors: Interactors)
    : IndoorAirMonitorViewModel(application, interactors) {


    val mlOutput = MutableLiveData<MLOutput>()

    fun getMLOutput(){
        GlobalScope.launch {
            mlOutput.postValue(interactors.getMLOutput())
        }
    }

    fun setDummyMLOutput(dummy: String){
        GlobalScope.launch {
            withContext(Dispatchers.IO) {
                interactors.setDummyMLOutput(dummy)
            }
        }
    }
}
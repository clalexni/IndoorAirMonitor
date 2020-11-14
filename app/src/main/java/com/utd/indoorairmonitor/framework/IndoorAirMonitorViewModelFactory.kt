package com.utd.indoorairmonitor.framework

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

object IndoorAirMonitorViewModelFactory : ViewModelProvider.Factory {

  lateinit var application: Application

  lateinit var dependencies: Interactors

  fun inject(application: Application, dependencies: Interactors) {
    IndoorAirMonitorViewModelFactory.application = application
    IndoorAirMonitorViewModelFactory.dependencies = dependencies
  }

  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if(IndoorAirMonitorViewModel::class.java.isAssignableFrom(modelClass)) {
      return modelClass.getConstructor(Application::class.java, Interactors::class.java)
          .newInstance(
              application,
              dependencies)
    } else {
      throw IllegalStateException("ViewModel must extend MajesticViewModel")
    }
  }

}

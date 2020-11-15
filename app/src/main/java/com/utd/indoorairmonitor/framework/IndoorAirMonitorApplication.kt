package com.utd.indoorairmonitor.framework

import android.app.Application
import com.utd.indoorairmonitor.data.*
import com.utd.indoorairmonitor.interactors.airMonitor.*
import com.utd.indoorairmonitor.interactors.mlModel.*
import com.utd.indoorairmonitor.interactors.weather.*

import com.utd.indoorairmonitor.framework.asthmaMLModel.AsthmaMLModel
import com.utd.indoorairmonitor.framework.openWeather.OpenWeatherAPI
import com.utd.indoorairmonitor.framework.purpleAirMonitor.PurpleAirMonitorAPI

import com.utd.indoorairmonitor.interactors.*

class IndoorAirMonitorApplication : Application() {

  override fun onCreate() {
      super.onCreate()
      val airMonitorRepository = AirMonitorRepository(PurpleAirMonitorAPI())
      val weatherRepository = WeatherRepository(OpenWeatherAPI())
      val mlModelRepository = MLModelRepository(AsthmaMLModel())

      IndoorAirMonitorViewModelFactory.inject(this,
          Interactors(
              UpdateAirMonitor(airMonitorRepository),
              GetPM2_5(airMonitorRepository),
              GetPM10_0(airMonitorRepository),
              SetAirMonitorID(airMonitorRepository),

              UpdateWeather(weatherRepository),
              GetHumidity(weatherRepository),
              GetTemperature(weatherRepository),
              SetZipCode(weatherRepository),

              PredictMLResults(mlModelRepository),
              GetMLResults(mlModelRepository),
              GetMLOutput1(mlModelRepository),
              GetMLOutput2(mlModelRepository)
          )
      )
  }

}
package com.utd.indoorairmonitor.framework

import android.app.Application
import android.util.Log
import com.utd.indoorairmonitor.data.*
import com.utd.indoorairmonitor.interactors.airMonitor.*
import com.utd.indoorairmonitor.interactors.mlModel.*
import com.utd.indoorairmonitor.interactors.weather.*

import com.utd.indoorairmonitor.framework.asthmaMLModel.AsthmaMLModel
import com.utd.indoorairmonitor.framework.openWeather.OpenWeatherAPI
import com.utd.indoorairmonitor.framework.purpleAirMonitor.PurpleAirMonitorAPI
import com.utd.indoorairmonitor.framework.peakflow.PeakFlowDataSourceImp
import com.utd.indoorairmonitor.framework.questionnaire.QuestionnaireAnswerDataSourceImp
import com.utd.indoorairmonitor.interactors.peakFlow.GetPeakFlow
import com.utd.indoorairmonitor.interactors.peakFlow.SetPeakFlow
import com.utd.indoorairmonitor.interactors.questionnaire.GetQuestionnaireAnswer
import com.utd.indoorairmonitor.interactors.questionnaire.SetQuestinonnaireAnswer

class IndoorAirMonitorApplication : Application() {
    override fun onCreate() {
        //Log.i("test", "before on created")

        val airMonitorRepository = AirMonitorRepository(PurpleAirMonitorAPI())
        val weatherRepository = WeatherRepository(OpenWeatherAPI())
        val mlModelRepository = MLModelRepository(AsthmaMLModel())

        val peakFlowRepository = PeakFlowRepository(PeakFlowDataSourceImp())
        val questionnaireAnswerRepository
                = QuestionnaireAnswerRepository(QuestionnaireAnswerDataSourceImp())

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
                        GetMLOutput2(mlModelRepository),

                        GetPeakFlow(peakFlowRepository),
                        SetPeakFlow(peakFlowRepository),

                        GetQuestionnaireAnswer(questionnaireAnswerRepository),
                        SetQuestinonnaireAnswer(questionnaireAnswerRepository)
                )
        )
        super.onCreate()

    }

}

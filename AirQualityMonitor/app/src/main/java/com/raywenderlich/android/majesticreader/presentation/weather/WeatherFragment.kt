package com.raywenderlich.android.majesticreader.presentation.weather

import android.app.AlertDialog
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.raywenderlich.android.majesticreader.R
import com.raywenderlich.android.majesticreader.framework.MajesticViewModelFactory
import kotlinx.android.synthetic.main.weather_fragment.*

class WeatherFragment : Fragment() {

    companion object {
        fun newInstance() = WeatherFragment()
    }

    private lateinit var viewModel: WeatherViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, MajesticViewModelFactory).get(WeatherViewModel::class.java)

        viewModel.temperature.observe(this, Observer<Double> { newName ->
            temperatureData.text = newName.toString()})

        viewModel.humidity.observe(this, Observer<Int> { newName ->
            humidityData.text = newName.toString()})

        setZipCode.setOnClickListener {

            viewModel.setZipCode(zipCodeEdit.text.toString())
            setZipCode.text = "Polling"
            Toast.makeText(context,"Polling Data", Toast.LENGTH_LONG).show()
        }

        zipCodeInfo.setOnClickListener {

            val helpText = "Put your zip code here in order to get local weather data."

            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setMessage(helpText)

            val alert = dialogBuilder.create()
            alert.setTitle("Zip Code Info")

            alert.show()
        }

        pollWeatherData()
    }
    private fun pollWeatherData() {
        val handler = Handler()

        val weatherPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.updateWeather()
                setZipCode.text = getString(R.string.set_data)
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                handler.postDelayed(this, 20000)
            }
        }
        handler.postDelayed(weatherPoll, 0)
    }

}
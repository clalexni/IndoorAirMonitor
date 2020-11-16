package com.utd.indoorairmonitor.presentation.home

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.utd.indoorairmonitor.R
import com.utd.indoorairmonitor.databinding.FragmentHomeBinding
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModelFactory
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_questionaire.*

class HomeFragment : Fragment() {
    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // set fragment title
        (activity as AppCompatActivity).supportActionBar?.title = "Home"

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )

        // get view model from provider
        viewModel = ViewModelProvider(this, IndoorAirMonitorViewModelFactory).get(HomeViewModel::class.java)

        // set onClick listeners
        fetch_button.setOnClickListener {
            viewModel.setDeviceName(monitorId_edit.text.toString())
            viewModel.setZipCode(zip_edit.text.toString())
            viewModel.setPeakFlow(pefr_edit.text.toString().toDouble())

            Toast.makeText(context,"Fetching Data...", Toast.LENGTH_LONG).show()

            pollWeatherData()
            pollAirMonitorData()
        }

//        submitButton.setOnClickListener {
//            pollMLModel()
//            Toast.makeText(context,viewModel.output1.toString(), Toast.LENGTH_LONG).show()
//        }

        // observe value changes for the private data field of the view model
        // reflect the change on view
        viewModel.pm2_5.observe(viewLifecycleOwner, Observer<Double> { newName ->
            pm25_text.text = newName.toString()})
        viewModel.pm10_0.observe(viewLifecycleOwner, Observer<Double> { newName ->
            pm25_text.text = newName.toString()})
//        viewModel.temperature.observe(viewLifecycleOwner, Observer<Double> { newName ->
//            temp_edit.text = newName.toString()})
//        viewModel.humidity.observe(viewLifecycleOwner, Observer<Int> { newName ->
//            hum_edit.text = newName.toString()})


        return binding.root
    }
    private fun pollWeatherData() {
        //handler depreciated
        //val handler = Handler()

        val weatherPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.updateWeather()
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                Handler(Looper.getMainLooper()).postDelayed(this, 20000)
            }
        }
        Handler(Looper.getMainLooper()).postDelayed(weatherPoll, 0)
    }
    private fun pollAirMonitorData() {
        //handler depreciated
        //val handler = Handler()

        val airMonitorPoll = object : Runnable {
            override fun run() {
                viewModel.updateAirMonitor()
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                Handler(Looper.getMainLooper()).postDelayed(this, 20000)
            }
        }

        Handler(Looper.getMainLooper()).postDelayed(airMonitorPoll, 0)
    }
    private fun pollMLModel() {

        val weatherPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.predictMLResults()
                Log.d("timer", "20 secs passed and Model is Polled")
                Handler(Looper.getMainLooper()).postDelayed(this, 20000)
            }
        }
        Handler(Looper.getMainLooper()).postDelayed(weatherPoll, 1)
    }
}
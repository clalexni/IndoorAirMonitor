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
import kotlinx.coroutines.delay


class HomeFragment : Fragment() {

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

        var isPollStarted = false
        // set listeners
        binding.fetchButton.setOnClickListener {
            viewModel.setDeviceName(monitorId_edit.text.toString())
            viewModel.setZipCode(zip_edit.text.toString())
            viewModel.setPeakFlow(pefr_edit.text.toString().toDouble())

            Toast.makeText(context,"Fetching Data...", Toast.LENGTH_LONG).show()

            if (isPollStarted == false) //timer to fetch if after 20 secs or something.
                viewModel.updateWeather()
                viewModel.updateAirMonitor()

            isPollStarted = true
        }
        binding.predictButton.setOnClickListener {
            viewModel.predictMLResults()
            var x =viewModel.output1.value
            Toast.makeText(context,x.toString(), Toast.LENGTH_SHORT).show()
        }
        if(isPollStarted){
            pollData()
            pollMLModel()
        }

        binding.pefrInfoImage.setOnClickListener {
            val helpText = "Please enter your peak expiratory flow rate (PEFR) measurement."
            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setMessage(helpText)
            val alert = dialogBuilder.create()
            alert.setTitle("Device ID Info")
            alert.show()
        }

        binding.zipInfoImage.setOnClickListener {
            val helpText = "Put your zip code here in order to get local weather data."
            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setMessage(helpText)
            val alert = dialogBuilder.create()
            alert.setTitle("Zip Code Info")
            alert.show()
        }

        binding.monitorIdInfoImage.setOnClickListener {
            val helpText = "Device-ID: A unique code for every sensor the is printed on the sensor sticker or listed in the shipping confirmation email."
            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setMessage(helpText)
            val alert = dialogBuilder.create()
            alert.setTitle("Zip Code Info")
            alert.show()
        }

        // observe value changes for the private data field of the view model
        // reflect the change on view
        viewModel.pm2_5.observe(viewLifecycleOwner, Observer<Double> { newName ->
            pm25_edit.setText(newName.toString()) })
        viewModel.pm10_0.observe(viewLifecycleOwner, Observer<Double> { newName ->
            pm10_edit.setText(newName.toString())})
        viewModel.temperature.observe(viewLifecycleOwner, Observer<Double> { newName ->
            temp_edit.setText(newName.toString())})
        viewModel.humidity.observe(viewLifecycleOwner, Observer<Int> { newName ->
            hum_edit.setText(newName.toString())})

        return binding.root
    }

    private fun pollData() {
        //handler depreciated
        //val handler = Handler()
        //viewModel.updateWeather()
        val weatherPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.updateWeather()
                viewModel.updateAirMonitor()
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                Handler(Looper.getMainLooper()).postDelayed(this, 20000)
            }
        }
        Handler(Looper.getMainLooper()).postDelayed(weatherPoll, 0)
    }

    private fun pollMLModel() {
        viewModel.predictMLResults()
        val mlPoll = object : Runnable {

            override fun run() {
                //put code here
                viewModel.predictMLResults()
                Log.d("timer", "20 secs passed and Model is Polled")
                Handler(Looper.getMainLooper()).postDelayed(this, 20000)
            }
        }
        Handler(Looper.getMainLooper()).postDelayed(mlPoll, 1000)
    }
}
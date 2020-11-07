package com.raywenderlich.android.majesticreader.presentation.airQuality

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.raywenderlich.android.majesticreader.R
import com.raywenderlich.android.majesticreader.framework.MajesticViewModelFactory
import kotlinx.android.synthetic.main.air_quality_fragment.*

class AirQualityFragment : Fragment() {

    companion object {
        fun newInstance() = AirQualityFragment()
    }

    private lateinit var viewModel: AirQualityViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.air_quality_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Causing crash
        viewModel = ViewModelProviders.of(this, MajesticViewModelFactory).get(AirQualityViewModel::class.java)

        //viewModel.readAirQuality()   //need to put in a poll

        viewModel.pm2_5.observe(this, Observer<Double> { newName ->
            pm2_5Item.text = newName.toString()})

        viewModel.pm10_0.observe(this, Observer<Double> { newName ->
            pm10_0Item.text = newName.toString()})

        setDeviceName.setOnClickListener {

            //make sure input is interger only and valid set of integer > 0
            viewModel.setDeviceName(editDeviceName.text.toString())
        }

        //Helper button to give info on where to find device id.
        //Get info here https://www2.purpleair.com/community/faq
        //Polling
        airMonitorPoll()
    }

    private fun airMonitorPoll() {
        val handler = Handler()

        val airMonitorPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.readAirQuality()
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                handler.postDelayed(this, 20000)
            }
        }

        handler.postDelayed(airMonitorPoll, 0)
    }


}
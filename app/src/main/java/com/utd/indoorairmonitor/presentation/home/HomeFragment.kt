package com.utd.indoorairmonitor.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.utd.indoorairmonitor.R
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModelFactory
import com.utd.indoorairmonitor.presentation.airMonitor.AirMonitorViewModel
import com.utd.indoorairmonitor.presentation.mlModel.MLModelViewModel
import com.utd.indoorairmonitor.presentation.weather.WeatherViewModel

class HomeFragment : Fragment() {


    companion object {
        fun newInstance() = HomeFragment()
    }

    // view models
    private lateinit var mlVM: MLModelViewModel
    private lateinit var weatherVM: WeatherViewModel
    private lateinit var airMonitorVM: AirMonitorViewModel


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // set title
        (activity as AppCompatActivity).supportActionBar?.title = "Home"

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    @Suppress("DEPRECATION")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // init the view models
        mlVM = ViewModelProviders.of(this, IndoorAirMonitorViewModelFactory).get(MLModelViewModel::class.java)
        airMonitorVM = ViewModelProviders.of(this, IndoorAirMonitorViewModelFactory).get(AirMonitorViewModel::class.java)
        weatherVM = ViewModelProviders.of(this, IndoorAirMonitorViewModelFactory).get(WeatherViewModel::class.java)


    }


}
package com.utd.indoorairmonitor.presentation.home

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.utd.indoorairmonitor.R
import com.utd.indoorairmonitor.framework.IndoorAirMonitorViewModelFactory
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    // view models
    //private lateinit var mlVM: MLModelViewModel
    //private lateinit var weatherVM: WeatherViewModel
    //private lateinit var airMonitorVM: AirMonitorViewModel


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // set fragment title
        (activity as AppCompatActivity).supportActionBar?.title = "Home"

        // set listeners
//        zip_info_image.setOnClickListener {
//
//            val helpText = "Put your zip code here in order to get local weather data."
//
//            val dialogBuilder = AlertDialog.Builder(context)
//            dialogBuilder.setMessage(helpText)
//
//            val alert = dialogBuilder.create()
//            alert.setTitle("Zip Code Info")
//
//            alert.show()
//        }
//        monitorId_info_image.setOnClickListener {
//
//            val helpText = "Device-ID: A unique code for every sensor the is printed on the sensor sticker or listed in the shipping confirmation email."
//
//            val dialogBuilder = AlertDialog.Builder(context)
//            dialogBuilder.setMessage(helpText)
//
//            val alert = dialogBuilder.create()
//            alert.setTitle("Device ID Info")
//
//            alert.show()
//        }
//
//        pefr_info_image.setOnClickListener {
//
//            val helpText = "PEFR: peak expiratory flow rate. Enter your measurement from your peak flow device."
//
//            val dialogBuilder = AlertDialog.Builder(context)
//            dialogBuilder.setMessage(helpText)
//
//            val alert = dialogBuilder.create()
//            alert.setTitle("PEFR Info")
//
//            alert.show()
//        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    @Suppress("DEPRECATION")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // init the view models
        //mlVM = ViewModelProviders.of(this, IndoorAirMonitorViewModelFactory).get(MLModelViewModel::class.java)
        //airMonitorVM = ViewModelProviders.of(this, IndoorAirMonitorViewModelFactory).get(AirMonitorViewModel::class.java)
        // weatherVM = ViewModelProvider(this).get(WeatherViewModel::class.java)


    }


}
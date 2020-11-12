package com.raywenderlich.android.majesticreader.presentation.airMonitor

import android.app.AlertDialog
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.Observer
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import kotlinx.android.synthetic.main.air_quality_fragment.*
import com.raywenderlich.android.majesticreader.R
import com.raywenderlich.android.majesticreader.framework.MajesticViewModelFactory

class AirMonitorFragment : Fragment() {

    companion object {
        fun newInstance() = AirMonitorFragment()
    }

    private lateinit var viewModel: AirMonitorViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.air_quality_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this, MajesticViewModelFactory).get(AirMonitorViewModel::class.java)

        viewModel.pm2_5.observe(this, Observer<Double> { newName ->
            pm2_5Data.text = newName.toString()})

        viewModel.pm10_0.observe(this, Observer<Double> { newName ->
            pm10_0Data.text = newName.toString()})

        setMonitorID.setOnClickListener {

            viewModel.setDeviceName(monitorEdit.text.toString())
            setMonitorID.text = "Polling"
            Toast.makeText(context,"Polling Data", Toast.LENGTH_LONG).show()
        }

        monitorInfo.setOnClickListener {

            val helpText = "Device-ID: A unique code for every sensor the is printed on the sensor sticker or listed in the shipping confirmation email."

            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setMessage(helpText)

            val alert = dialogBuilder.create()
            alert.setTitle("Device ID Info")

            alert.show()
        }

        pollAirMonitorData()
    }
    private fun pollAirMonitorData() {
        val handler = Handler()

        val airMonitorPoll = object : Runnable {
            override fun run() {
                viewModel.updateAirMonitor()
                setMonitorID.text = getString(R.string.set_data)
                Log.d("timer", "20 secs passed and AirMonitor API is Polled")
                handler.postDelayed(this, 20000)
            }
        }

        handler.postDelayed(airMonitorPoll, 0)
    }
}
package com.example.airqualitymonitoring.ui.datastreams
// connect to, get data from, and send data to each bluetooth device

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.airqualitymonitoring.R

class BluetoothDevicesFragment : Fragment() {

    private lateinit var bluetoothDevicesViewModel: BluetoothDevicesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        bluetoothDevicesViewModel =
                ViewModelProviders.of(this).get(BluetoothDevicesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        bluetoothDevicesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
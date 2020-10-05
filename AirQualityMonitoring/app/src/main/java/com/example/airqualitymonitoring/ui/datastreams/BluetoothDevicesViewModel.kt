package com.example.airqualitymonitoring.ui.datastreams
// display info about connected devices

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BluetoothDevicesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text
}
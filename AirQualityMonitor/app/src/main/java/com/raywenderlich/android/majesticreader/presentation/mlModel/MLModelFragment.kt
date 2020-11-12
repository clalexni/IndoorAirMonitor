package com.raywenderlich.android.majesticreader.presentation.mlModel

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
import kotlinx.android.synthetic.main.ml_model_fragment.*
import kotlinx.android.synthetic.main.weather_fragment.*

class MLModelFragment : Fragment() {

    companion object {
        fun newInstance() = MLModelFragment()
    }

    private lateinit var viewModel: MLModelViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.ml_model_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, MajesticViewModelFactory).get(MLModelViewModel::class.java)

        viewModel.output1.observe(this, Observer<Double> { newName ->
            mlModelData.text = newName.toString()})

        pollMLModel()
    }
    private fun pollMLModel() {
        val handler = Handler()

        val weatherPoll = object : Runnable {
            override fun run() {
                //put code here
                viewModel.predictMLResults()
                Log.d("timer", "20 secs passed and Model is Polled")
                handler.postDelayed(this, 20000)
            }
        }
        handler.postDelayed(weatherPoll, 1)
    }

}
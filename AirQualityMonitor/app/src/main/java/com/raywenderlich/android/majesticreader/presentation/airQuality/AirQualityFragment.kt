package com.raywenderlich.android.majesticreader.presentation.airQuality

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
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

        val pm2_5Observer = Observer<Double> { newName ->
            // Update the UI, in this case, a TextView.
            air_quality_item.text = newName.toString()
        }
        viewModel.readPM2_5()
        viewModel.pm2_5.observe(this, pm2_5Observer)
    }

}
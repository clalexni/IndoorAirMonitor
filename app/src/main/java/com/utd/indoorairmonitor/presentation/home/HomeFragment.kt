package com.utd.indoorairmonitor.presentation.home

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
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


            Toast.makeText(context,"Fetching Data...", Toast.LENGTH_LONG).show()
        }

        submitButton.setOnClickListener {

        }


        return binding.root
    }


}
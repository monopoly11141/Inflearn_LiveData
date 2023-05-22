package com.example.inflearn_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.inflearn_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnMinus.setOnClickListener {
            viewModel.minusCount()
        }

        binding.btnPlus.setOnClickListener {
            viewModel.plusCount()
        }

        viewModel.countValue.observe(this, Observer {value ->
            binding.tvCount.text = value.toString()
        })
    }
}
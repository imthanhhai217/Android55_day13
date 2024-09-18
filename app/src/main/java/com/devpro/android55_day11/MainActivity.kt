package com.devpro.android55_day13

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.devpro.android55_day11.MainViewModel
import com.devpro.android55_day11.MainViewModelFactory
import com.devpro.android55_day13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
//    private val mainViewModel:MainViewModel by viewModels()
    private lateinit var mainViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.lifecycleOwner = this

        val viewModelFactory = MainViewModelFactory(this,application)
        mainViewModel = ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]

        mainBinding.mainViewModel = mainViewModel



//        mainViewModel.getUserInfo()
    }
}
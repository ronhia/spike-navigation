package com.ronha.spike.navigation.presentation.features.main

import android.os.Bundle
import com.ronha.spike.navigation.databinding.ActivityMainBinding
import com.ronha.spike.navigation.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getActivityBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupNavigation()
    }

    private fun setupNavigation() {

    }

}
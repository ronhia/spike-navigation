package com.ronha.spike.navigation.ui.features.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.ronha.spike.navigation.R
import com.ronha.spike.navigation.databinding.ActivityMainBinding
import com.ronha.spike.navigation.extensions.launchActivity
import com.ronha.spike.navigation.ui.base.BaseActivity
import com.ronha.spike.navigation.ui.features.qr.QrActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun getActivityBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupNavigation()
        setupQR()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.fcv_hostMain
        ) as NavHostFragment
        navController = navHostFragment.navController

        binding.bnvMain.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(TOP_LEVEL_DESTINATIONS)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun setupQR() {
        binding.bnvMain.menu.findItem(R.id.navigation_qr)?.apply {
            setOnMenuItemClickListener {
                goToQR()
                false
            }
        }
    }

    private fun goToQR() {
        launchActivity<QrActivity>()
    }

    companion object {
        private val TOP_LEVEL_DESTINATIONS = setOf(
            R.id.navigation_home,
            R.id.navigation_search,
            R.id.navigation_profile,
            R.id.navigation_setting
        )
    }

}
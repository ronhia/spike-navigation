package com.ronha.spike.navigation.presentation.features.login

import android.os.Bundle
import com.ronha.spike.navigation.databinding.ActivityLoginBinding
import com.ronha.spike.navigation.extensions.launchActivity
import com.ronha.spike.navigation.presentation.base.BaseActivity
import com.ronha.spike.navigation.presentation.features.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    override fun getActivityBinding(): ActivityLoginBinding {
        return ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        events()
    }

    private fun events() {
        binding.btnGoHome.setOnClickListener {
            launchActivity<MainActivity>(finished = true)
        }
    }

}
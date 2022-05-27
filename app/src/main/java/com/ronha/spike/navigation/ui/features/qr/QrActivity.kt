package com.ronha.spike.navigation.ui.features.qr

import android.os.Bundle
import com.ronha.spike.navigation.databinding.ActivityQrBinding
import com.ronha.spike.navigation.ui.base.BaseActivity

class QrActivity : BaseActivity<ActivityQrBinding>() {

    override fun getActivityBinding(): ActivityQrBinding {
        return ActivityQrBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
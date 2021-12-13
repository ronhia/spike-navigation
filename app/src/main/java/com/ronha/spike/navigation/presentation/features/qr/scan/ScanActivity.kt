package com.ronha.spike.navigation.presentation.features.qr.scan

import com.ronha.spike.navigation.databinding.ActivityScanBinding
import com.ronha.spike.navigation.presentation.base.BaseActivity

class ScanActivity : BaseActivity<ActivityScanBinding>() {

    override fun getActivityBinding(): ActivityScanBinding {
        return ActivityScanBinding.inflate(layoutInflater)
    }

}
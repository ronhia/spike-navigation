package com.ronha.spike.navigation.ui.features.qr.scan

import com.ronha.spike.navigation.databinding.ActivityScanBinding
import com.ronha.spike.navigation.ui.base.BaseActivity

class ScanActivity : BaseActivity<ActivityScanBinding>() {

    override fun getActivityBinding(): ActivityScanBinding {
        return ActivityScanBinding.inflate(layoutInflater)
    }

}
package com.ronha.spike.navigation.ui.features.qr.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentQrPaymentConstancyBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class QrPaymentConstancyFragment : BaseFragment<FragmentQrPaymentConstancyBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentQrPaymentConstancyBinding {
        return FragmentQrPaymentConstancyBinding.inflate(inflater, container, false)
    }

}
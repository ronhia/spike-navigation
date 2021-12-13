package com.ronha.spike.navigation.presentation.features.qr.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentPaymentConstancyBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class PaymentConstancyFragment : BaseFragment<FragmentPaymentConstancyBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPaymentConstancyBinding {
        return FragmentPaymentConstancyBinding.inflate(inflater, container, false)
    }

}
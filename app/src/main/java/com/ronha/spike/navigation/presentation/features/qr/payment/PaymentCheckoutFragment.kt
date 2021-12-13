package com.ronha.spike.navigation.presentation.features.qr.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentPaymentCheckoutBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class PaymentCheckoutFragment : BaseFragment<FragmentPaymentCheckoutBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPaymentCheckoutBinding {
        return FragmentPaymentCheckoutBinding.inflate(inflater, container, false)
    }

}
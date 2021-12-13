package com.ronha.spike.navigation.presentation.features.qr.payment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentPaymentConfirmBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class PaymentConfirmFragment : BaseFragment<FragmentPaymentConfirmBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPaymentConfirmBinding {
        return FragmentPaymentConfirmBinding.inflate(inflater, container, false)
    }

}
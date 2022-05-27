package com.ronha.spike.navigation.ui.features.qr.loading

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ronha.spike.navigation.databinding.FragmentQrLoadingBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class QrLoadingFragment : BaseFragment<FragmentQrLoadingBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentQrLoadingBinding {
        return FragmentQrLoadingBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events()
    }

    private fun events() = with(binding) {
        btnGoPayment.setOnClickListener {
            val action = QrLoadingFragmentDirections.toNavigationQrPaymentCheckout()
            findNavController().navigate(action)
        }
    }
}
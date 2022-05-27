package com.ronha.spike.navigation.ui.features.qr.payment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ronha.spike.navigation.R
import com.ronha.spike.navigation.databinding.FragmentQrPaymentConfirmBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class QrPaymentConfirmFragment : BaseFragment<FragmentQrPaymentConfirmBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentQrPaymentConfirmBinding {
        return FragmentQrPaymentConfirmBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events()
    }

    private fun events() = with(binding) {
        btnGoPaymentConstancy.setOnClickListener { goConstancy() }
        btnBack.setOnClickListener { back() }
        btnCloseQr.setOnClickListener { closeQR() }
    }

    private fun goConstancy() {
        val action = QrPaymentConfirmFragmentDirections.toNavigationQrPaymentConstancy()
        findNavController().navigate(action)
    }

    private fun back() {
        findNavController().popBackStack()
    }

    private fun closeQR() {
        findNavController().backQueue.clear()
        val isBack = findNavController().popBackStack()
        Log.e("isBack", "state: $isBack")

        if (isBack.not()) {
            requireActivity().finish()
        }
    }

}
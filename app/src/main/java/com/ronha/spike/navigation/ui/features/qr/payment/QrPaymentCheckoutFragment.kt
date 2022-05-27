package com.ronha.spike.navigation.ui.features.qr.payment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ronha.spike.navigation.databinding.FragmentQrPaymentCheckoutBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class QrPaymentCheckoutFragment : BaseFragment<FragmentQrPaymentCheckoutBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentQrPaymentCheckoutBinding {
        return FragmentQrPaymentCheckoutBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        events()
    }

    private fun events() = with(binding) {
        btnGoPaymentConfirm.setOnClickListener { goToConfirm() }
        btnCloseQr.setOnClickListener { closeQr() }
    }

    private fun goToConfirm() {
        val action = QrPaymentCheckoutFragmentDirections.toNavigationQrPaymentConfirm()
        findNavController().navigate(action)
    }

    private fun closeQr() {
        val isBack = findNavController().popBackStack()
        Log.e("isBack", "state: $isBack")
        if (isBack.not()) {
            requireActivity().finish()
        }
    }

}
package com.ronha.spike.navigation.presentation.features.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentProfileBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater, container, false)
    }

}
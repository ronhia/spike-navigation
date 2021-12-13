package com.ronha.spike.navigation.presentation.features.setting

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentSettingBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class SettingFragment : BaseFragment<FragmentSettingBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSettingBinding {
        return FragmentSettingBinding.inflate(inflater, container, false)
    }

}
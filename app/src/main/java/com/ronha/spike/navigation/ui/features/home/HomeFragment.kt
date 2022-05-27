package com.ronha.spike.navigation.ui.features.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentHomeBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

}
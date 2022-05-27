package com.ronha.spike.navigation.ui.features.search

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentSearchBinding
import com.ronha.spike.navigation.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(inflater, container, false)
    }
}
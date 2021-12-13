package com.ronha.spike.navigation.presentation.features.product

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ronha.spike.navigation.databinding.FragmentProductListBinding
import com.ronha.spike.navigation.presentation.base.BaseFragment

class ProductListFragment : BaseFragment<FragmentProductListBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProductListBinding {
        return FragmentProductListBinding.inflate(inflater, container, false)
    }

}
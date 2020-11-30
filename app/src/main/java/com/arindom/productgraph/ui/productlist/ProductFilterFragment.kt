package com.arindom.productgraph.ui.productlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.arindom.productgraph.R
import com.arindom.productgraph.databinding.FragmentProductListFilterBinding
import com.arindom.productgraph.ui.FilterType
import com.arindom.productgraph.ui.ProductListViewModel

class ProductFilterFragment : Fragment() {
    private lateinit var mBinding: FragmentProductListFilterBinding
    private val mProductListViewModel by activityViewModels<ProductListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentProductListFilterBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        when (mProductListViewModel.filterType) {
            FilterType.HIGH_TO_LOW -> mBinding.filterHighToLow.isChecked = true
            FilterType.LOW_TO_HIGH -> mBinding.filterLowToHigh.isChecked = true
        }

        mBinding.rgFilterOptions.setOnCheckedChangeListener { _, id ->
            when (id) {
                R.id.filter_high_to_low -> mProductListViewModel.filterType =
                    FilterType.HIGH_TO_LOW
                R.id.filter_low_to_high -> mProductListViewModel.filterType =
                    FilterType.LOW_TO_HIGH
            }
        }
        mBinding.btApplyFilter.setOnClickListener { it.findNavController().navigateUp() }
    }
}
package com.arindom.productgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arindom.productgraph.databinding.FragmentOpenOrdersBinding

class DeliveriesOpenOrderNavHostFragment : Fragment() {
    private lateinit var mBinding: FragmentOpenOrdersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentOpenOrdersBinding.inflate(inflater, container, false)
        return mBinding.root
    }

}
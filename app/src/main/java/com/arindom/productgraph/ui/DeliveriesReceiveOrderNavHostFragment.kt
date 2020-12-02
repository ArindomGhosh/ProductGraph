package com.arindom.productgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arindom.productgraph.databinding.FragmentReviewOrdersBinding

class DeliveriesReceiveOrderNavHostFragment : Fragment() {
    private lateinit var mBinding: FragmentReviewOrdersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentReviewOrdersBinding.inflate(inflater, container, false)
        return mBinding.root
    }
}
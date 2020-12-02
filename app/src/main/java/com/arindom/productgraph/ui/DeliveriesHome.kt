package com.arindom.productgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.arindom.productgraph.R
import com.arindom.productgraph.databinding.FragmentDeliveriesHomeBinding

class DeliveriesHome : Fragment() {
    private lateinit var mBinding: FragmentDeliveriesHomeBinding
    private val rootNavigationController: NavController? by lazy { activity?.findNavController(R.id.fragment_main) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDeliveriesHomeBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.tvOpenOrders.setOnClickListener {
            it.findNavController().navigate(DeliveriesHomeDirections.actionDeliveriesHomeToNavigationOpenDeliveries())
            //other ways of navigation
//            it.findNavController()
//                .navigate(DeliveriesHomeDirections.actionDeliveriesHomeToDeliveriesOpenOrderFlowFragment())
//            rootNavigationController?.navigate(R.id.product_navigation)
        }

        mBinding.tvReviewDeliveries.setOnClickListener {
            it.findNavController().navigate(DeliveriesHomeDirections.actionDeliveriesHomeToNavigationReceivingDeliveries())
            //other ways of navigation
//            it.findNavController()
//                .navigate(DeliveriesHomeDirections.actionDeliveriesHomeToDeliveriesReceiveOrderFlowFragment())
//            rootNavigationController?.navigate(R.id.receive_deliveries_navigation)
        }
    }
}
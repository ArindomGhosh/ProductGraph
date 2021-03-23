package com.arindom.productgraph.ui.productlist

import android.os.Bundle
import androidx.navigation.findNavController
import com.arindom.productgraph.repository.models.Product

class OpenOrderProductList:ProductListFragment() {
    override fun onClicked(product: Product) {
        val action =
            OpenOrderProductListDirections.actionNavProductListToProductDetailsFragment(product)
        mBinding.root.findNavController().navigate(action)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.fabFilterList.setOnClickListener {
            mBinding.root.findNavController()
                .navigate(OpenOrderProductListDirections.actionNavProductListToProductFilterFragment())
        }
    }
}
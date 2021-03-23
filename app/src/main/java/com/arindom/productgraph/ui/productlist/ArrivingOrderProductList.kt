package com.arindom.productgraph.ui.productlist

import android.os.Bundle
import com.arindom.productgraph.repository.models.Product
import com.google.android.material.snackbar.Snackbar

class ArrivingOrderProductList : ProductListFragment() {
    override fun onClicked(product: Product) {
        Snackbar.make(
            mBinding.root,
            "This feature not implemented for Arriving Orders",
            Snackbar.LENGTH_SHORT
        ).show()
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.fabFilterList.setOnClickListener {
            Snackbar.make(
                mBinding.root,
                "This feature not implemented for Arriving Orders",
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}
package com.arindom.productgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.arindom.productgraph.databinding.FragmentProductDetailsBinding
import com.arindom.productgraph.repository.models.Product

class ProductDetailsFragment : Fragment() {
    private lateinit var mBinding: FragmentProductDetailsBinding
    private lateinit var mProduct: Product
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).configureToolbar("Product Details")
        arguments?.let {
            mProduct = ProductDetailsFragmentArgs.fromBundle(it).product
            mBinding.tvProductName.text = mProduct.name
            mBinding.tvProductDetail.text = mProduct.description
        }
        mBinding.btReview.setOnClickListener {
            val action =
                ProductDetailsFragmentDirections.actionProductDetailsFragmentToProductReviewFragment(
                    mProduct
                )
            mBinding.root.findNavController().navigate(action)
        }
    }
}
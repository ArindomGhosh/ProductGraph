package com.arindom.productgraph.ui.productreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.arindom.productgraph.databinding.FragmentProductReviewBinding
import com.arindom.productgraph.repository.getProductReviewQA
import com.arindom.productgraph.repository.models.Product
import com.arindom.productgraph.ui.MainActivity
import com.arindom.productgraph.ui.ProductDetailsFragmentArgs
import com.arindom.productgraph.ui.productreview.adapter.ProductReviewAdapter

class ProductReviewFragment : Fragment() {
    private lateinit var mBinding: FragmentProductReviewBinding
    private lateinit var mProduct: Product
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentProductReviewBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).configureToolbar("Product Review")
        arguments?.let {
            mProduct = ProductDetailsFragmentArgs.fromBundle(it).product
        }
        mBinding.btSubmit.setOnClickListener { it.findNavController().navigateUp() }
        val mLinearLayoutManager = LinearLayoutManager(this.context)
        val mProductReviewAdapter = ProductReviewAdapter(getProductReviewQA())
        mBinding.rvProductQa.layoutManager = mLinearLayoutManager
        mBinding.rvProductQa.adapter = mProductReviewAdapter
    }
}
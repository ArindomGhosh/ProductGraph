package com.arindom.productgraph.ui.productlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.arindom.productgraph.databinding.FragmentProductListBinding
import com.arindom.productgraph.repository.models.Product
import com.arindom.productgraph.ui.MainActivity
import com.arindom.productgraph.ui.ProductListViewModel
import com.arindom.productgraph.ui.productlist.adapter.ProductListAdapter

abstract class ProductListFragment : Fragment(), ProductListAdapter.OnItemClickListener {
    protected lateinit var mBinding: FragmentProductListBinding
    private val mProductListAdapter = ProductListAdapter(emptyList(), this)
    private val mProductListViewModel by activityViewModels<ProductListViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentProductListBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).configureToolbar("Product List")
        setUpProductList()
        mProductListAdapter.updateList(mProductListViewModel.getFilteredProductList())
    }

    private fun setUpProductList() {
        mBinding.rvProductList.layoutManager = LinearLayoutManager(this.context)
        mBinding.rvProductList.adapter = mProductListAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("view destroyed")
    }
}
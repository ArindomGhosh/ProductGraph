package com.arindom.productgraph.ui.productlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arindom.productgraph.databinding.ItemProductBinding
import com.arindom.productgraph.repository.models.Product

class ProductListAdapter(
    private var productList: List<Product>,
    private val mOnItemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder>() {

    inner class ProductListViewHolder(private val mItemProductBinding: ItemProductBinding) :
        RecyclerView.ViewHolder(mItemProductBinding.root) {
        fun bind(mProduct: Product) {
            mItemProductBinding.tvProductName.text = mProduct.name
            mItemProductBinding.tvProductDescription.text = mProduct.description
            mItemProductBinding.tvCount.text = "${mProduct.orderAmount}"
            mItemProductBinding.root.setOnClickListener { mOnItemClickListener.onClicked(mProduct) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductListViewHolder {
        val mBinding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductListViewHolder(mBinding)
    }

    override fun onBindViewHolder(holder: ProductListViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    fun updateList(productList: List<Product>) {
        this.productList = productList
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onClicked(product: Product)
    }
}
package com.arindom.productgraph.ui.productreview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arindom.productgraph.databinding.ItemProductReviewBinding
import com.arindom.productgraph.repository.models.ProductReview

class ProductReviewAdapter(private val productReviewQAList: List<ProductReview>) :
    RecyclerView.Adapter<ProductReviewAdapter.ProductReviewViewHolder>() {
    inner class ProductReviewViewHolder(private val mItemProductReviewBinding: ItemProductReviewBinding) :
        RecyclerView.ViewHolder(mItemProductReviewBinding.root) {
        fun bind(productReview: ProductReview) {
            mItemProductReviewBinding.tvQuestion.text = productReview.question
            mItemProductReviewBinding.rbOptionOne.text = productReview.options[0]
            mItemProductReviewBinding.rbOptionTwo.text = productReview.options[1]
            mItemProductReviewBinding.rbOptionThree.text = productReview.options[2]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductReviewViewHolder {
        return ProductReviewViewHolder(
            ItemProductReviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductReviewViewHolder, position: Int) {
        holder.bind(productReviewQAList[position])
    }

    override fun getItemCount(): Int {
        return productReviewQAList.size
    }
}
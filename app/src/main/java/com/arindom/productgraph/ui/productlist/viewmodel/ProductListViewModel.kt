package com.arindom.productgraph.ui

import androidx.lifecycle.ViewModel
import com.arindom.productgraph.repository.getProductList
import com.arindom.productgraph.repository.models.Product

enum class FilterType {
    HIGH_TO_LOW,
    LOW_TO_HIGH
}

class ProductListViewModel : ViewModel() {
    var filterType: FilterType? = null

    fun getFilteredProductList(): List<Product> {
        return filterType?.let {
            if (it == FilterType.HIGH_TO_LOW) {
                getProductList().sortedByDescending { product -> product.orderAmount }
            } else {
                getProductList().sortedBy { product -> product.orderAmount }
            }
        }
            ?: getProductList()
    }
}
package com.arindom.productgraph.repository.models

data class ProductReview(
    val question: String,
    val options: List<String> = listOf(
        "may be",
        "No",
        "Yes"
    )
)
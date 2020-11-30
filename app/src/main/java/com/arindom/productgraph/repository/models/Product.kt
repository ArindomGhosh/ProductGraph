package com.arindom.productgraph.repository.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String,
    val description: String,
    val orderAmount: Int
) : Parcelable
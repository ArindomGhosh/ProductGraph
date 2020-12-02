package com.arindom.productgraph.repository.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Orders(
    val orderNumber: Int,
    val orderAmount: Int,
    val catalog: Catalog,
    val department: Department
) : Parcelable

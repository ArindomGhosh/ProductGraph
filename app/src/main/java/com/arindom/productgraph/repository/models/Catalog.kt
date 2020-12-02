package com.arindom.productgraph.repository.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Catalog(
    val catalogId: Int,
    val name: String
):Parcelable

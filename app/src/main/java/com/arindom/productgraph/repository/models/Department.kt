package com.arindom.productgraph.repository.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Department(
    @DrawableRes val icon: Int,
    val id: Int,
    val name: String,
    val arriving: Int = 0,
    val review: Int = 0
) : Parcelable

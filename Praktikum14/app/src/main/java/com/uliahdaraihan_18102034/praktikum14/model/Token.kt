package com.uliahdaraihan_18102034.praktikum14.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Token (
    var token: String? = null
): Parcelable
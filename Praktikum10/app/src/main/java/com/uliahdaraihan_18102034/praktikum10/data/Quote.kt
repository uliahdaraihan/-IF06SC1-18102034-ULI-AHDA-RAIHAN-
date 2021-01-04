package com.uliahdaraihan_18102034.praktikum10.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Quote(
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var nama: String? = null,
    var kota: String? = null,
    var date: String? = null
) : Parcelable
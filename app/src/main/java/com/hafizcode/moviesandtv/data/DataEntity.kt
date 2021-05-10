package com.hafizcode.moviesandtv.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataEntity(
    var id: String,
    var title: String,
    var description: String,
    var genre: String,
    var releasedYear: String,
    var imgPoster: Int,
    var imgBackground: Int
) : Parcelable

package model

import androidx.annotation.DrawableRes

data class HobiMatch(
    val nama: String,
    val deskripsi: String,
    val kategori: String,
    @DrawableRes val imageRes: Int
)
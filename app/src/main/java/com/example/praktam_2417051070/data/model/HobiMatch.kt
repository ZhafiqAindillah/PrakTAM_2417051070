package com.example.praktam_2417051070.data.model

import com.google.gson.annotations.SerializedName

data class HobiMatch(
    @SerializedName("nama") val nama: String,
    @SerializedName("deskripsi") val deskripsi: String,
    @SerializedName("kategori") val kategori: String,
    @SerializedName("image_url") val imageUrl: String
)
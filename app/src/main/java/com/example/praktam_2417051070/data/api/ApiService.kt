package com.example.praktam_2417051070.data.api

import com.example.praktam_2417051070.data.model.HobiMatch
import retrofit2.http.GET

interface ApiService {
    @GET("hobi_match.json")
    suspend fun getHobiMatches(): List<HobiMatch>
}
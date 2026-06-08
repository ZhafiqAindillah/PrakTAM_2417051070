package com.example.praktam_2417051070.data.repository

import com.example.praktam_2417051070.data.api.RetrofitClient
import com.example.praktam_2417051070.data.model.HobiMatch

class HobiRepository {
    suspend fun getHobiData(): List<HobiMatch> {
        return try {
            RetrofitClient.instance.getHobiMatches()
        } catch (e: Exception) {
            emptyList()
        }
    }
}
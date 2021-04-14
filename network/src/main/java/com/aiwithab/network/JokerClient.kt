package com.aiwithab.network

import com.aiwithab.network.services.JokerAPI
import com.aiwithab.network.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JokerClient {

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val api: JokerAPI = retrofit.create(JokerAPI::class.java)

}
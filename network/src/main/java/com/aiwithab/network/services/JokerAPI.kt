package com.aiwithab.network.services

import com.aiwithab.network.model.JokeModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface JokerAPI {

    @GET("/jokes/random")
    suspend fun getRandomJoke(): JokeModel

}
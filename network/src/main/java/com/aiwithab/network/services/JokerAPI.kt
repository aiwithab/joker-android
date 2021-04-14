package com.aiwithab.network.services

import com.aiwithab.network.model.JokeModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface JokerAPI {

    @GET("/jokes/random")
    suspend fun getRandomJoke(): JokeModel

    @GET("/jokes/programming/random")
    suspend fun getProgrammingJoke(): JokeModel

    @GET("/jokes/general/random")
    suspend fun getGeneralJoke(): JokeModel

    @GET("/jokes/knock-knock/random")
    suspend fun getKnockKnockJoke(): JokeModel

}
package com.aiwithab.joker.data

import com.aiwithab.network.JokerClient
import com.aiwithab.network.model.JokeModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import retrofit2.Response

object JokeRepo {

    private val api = JokerClient().api

     suspend fun getRandomJoke(): JokeModel = api.getRandomJoke()
     }

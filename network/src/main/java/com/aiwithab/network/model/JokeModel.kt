package com.aiwithab.network.model


import com.google.gson.annotations.SerializedName

data class JokeModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("punchline")
    val punchline: String,
    @SerializedName("setup")
    val setup: String,
    @SerializedName("type")
    val type: String
)
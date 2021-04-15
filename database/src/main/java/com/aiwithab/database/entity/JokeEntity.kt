package com.aiwithab.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "joke_entity")
data class JokeEntity(

    @PrimaryKey
    val id: Int,

    val punchline: String,

    val setup: String,

    val type: String
)

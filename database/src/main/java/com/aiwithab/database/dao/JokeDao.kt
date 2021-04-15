package com.aiwithab.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.aiwithab.database.entity.JokeEntity


@Dao
interface JokeDao {

    @Query("SELECT * FROM joke_entity")
    fun getAllJokes(): List<JokeEntity>

    @Query("SELECT * FROM joke_entity WHERE type IN (:type)")
    fun loadAllByType(type: String): List<JokeEntity>

    @Insert
    fun insertJoke(jokeEntity: JokeEntity)

    @Delete
    fun deleteJoke(jokeEntity: JokeEntity)


}
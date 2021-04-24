package com.aiwithab.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.aiwithab.db.entity.JokeEntity


@Dao
interface JokeDao {

    @Query("SELECT * FROM joke_entity")
    suspend fun getAllJokes(): List<JokeEntity>

    @Query("SELECT * FROM joke_entity WHERE type IN (:type)")
    suspend fun loadAllByType(type: String): List<JokeEntity>

    @Insert
    suspend fun insertJoke(jokeEntity: JokeEntity)

    @Delete
    suspend fun deleteJoke(jokeEntity: JokeEntity)


}
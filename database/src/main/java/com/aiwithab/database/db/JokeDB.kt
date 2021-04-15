package com.aiwithab.database.db

import androidx.room.Database
import com.aiwithab.database.dao.JokeDao
import com.aiwithab.database.entity.JokeEntity


@Database(entities = [JokeEntity::class], version = 1)
abstract class JokeDB {

    abstract fun jokeDao() : JokeDao





}
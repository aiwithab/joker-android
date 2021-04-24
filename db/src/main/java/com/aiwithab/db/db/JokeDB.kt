package com.aiwithab.db.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aiwithab.db.dao.JokeDao
import com.aiwithab.db.entity.JokeEntity


@Database(entities = [JokeEntity::class], version = 1)
abstract class JokeDB: RoomDatabase() {

    abstract fun jokeDao() : JokeDao





}
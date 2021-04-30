package com.aiwithab.db


import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.aiwithab.db.dao.JokeDao
import com.aiwithab.db.db.JokeDB
import com.aiwithab.db.entity.JokeEntity


class DatabaseManager private constructor(private val db: JokeDB) {

    suspend fun getAllJokes() : List<JokeEntity>{
        return db.jokeDao().getAllJokes()
    }


    companion object {

        @Volatile
        private var INSTANCE: DatabaseManager? = null

        @JvmStatic
        fun getInstance(context: Context): DatabaseManager {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: run {
                    val db = Room.databaseBuilder(
                        context,
                        JokeDB::class.java, "database-name"
                    ).build()
                    DatabaseManager(db).also { INSTANCE = it }
                }
            }
        }

    }


}


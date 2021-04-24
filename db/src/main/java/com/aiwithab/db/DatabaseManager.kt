package com.aiwithab.db


import android.content.Context
import androidx.room.Room
import com.aiwithab.db.db.JokeDB


class DatabaseManager private constructor(private val db: JokeDB) {

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


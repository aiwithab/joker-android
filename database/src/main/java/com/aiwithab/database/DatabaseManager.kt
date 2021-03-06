package com.aiwithab.database


import androidx.room.Room
import com.aiwithab.database.db.JokeDB

import javax.naming.Context

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


package com.aiwithab.db

import android.content.Context
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.aiwithab.db.entity.JokeEntity
import org.junit.Before
import org.junit.Test


class DatabaseManagerTest {

    @Before
    fun getDependency(): Context {
        lateinit var context: Context
        return context
    }


    @Test
    suspend fun getDataBaseTest() {

        val allJokes: List<JokeEntity> = DatabaseManager.getInstance(getDependency()).getAllJokes()


    }


}
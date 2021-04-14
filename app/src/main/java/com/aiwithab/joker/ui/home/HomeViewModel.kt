package com.aiwithab.joker.ui.home

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aiwithab.joker.data.JokeRepo
import com.aiwithab.network.model.JokeModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class HomeViewModel : ViewModel() {

    private val _randomJoke = MutableLiveData<JokeModel>()
    private val _textJoke = MutableLiveData<String>()
    private val _textPunchline = MutableLiveData<String>()

    private val randomJoke: LiveData<JokeModel> = _randomJoke
    val textJoke: LiveData<String> = _textJoke
    val textPunchline: LiveData<String> = _textPunchline

    suspend fun fetchRandomJoke() =   CoroutineScope(Dispatchers.IO).launch {

        val randomJoke = JokeRepo.getRandomJoke()
        Log.d(TAG, "fetchRandomJoke: $randomJoke")

        _textJoke.postValue(randomJoke.setup)
        _textPunchline.postValue(randomJoke.punchline)
        }






}
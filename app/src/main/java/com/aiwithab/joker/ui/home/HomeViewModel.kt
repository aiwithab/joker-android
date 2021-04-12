package com.aiwithab.joker.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _textJoke = MutableLiveData<String>().apply {
        value = "This is a joke"
    }
    private val _textPunchline = MutableLiveData<String>().apply {
        value = "a funny punchline!"
    }
    val textJoke: LiveData<String> = _textJoke
    val textPunchline: LiveData<String> = _textPunchline
}
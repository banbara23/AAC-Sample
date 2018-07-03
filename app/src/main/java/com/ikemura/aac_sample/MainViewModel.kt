package com.ikemura.aac_sample

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val name = MutableLiveData<String>()

    fun request() {
        name.value = "Steve"
    }

    fun getName(): LiveData<String> {
        return name
    }
}
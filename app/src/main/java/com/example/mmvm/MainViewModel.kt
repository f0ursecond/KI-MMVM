package com.example.mmvm

import android.content.Intent
import android.database.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = ObservableField(1)

    private val _navigateToActivity2 = MutableLiveData<Unit>()
    val navigateToActivity2: LiveData<Unit>
        get() = _navigateToActivity2
    fun increaseCounter(){
        val currentCounter = counter.get()?:1
        counter.set(currentCounter + 1)
    }
    fun decreaseCounter() {
        val currentCounter = counter.get()?:1
        counter.set(currentCounter - 1)
    }
    fun navigateToActivity2(){
        _navigateToActivity2.value = Unit
    }

}
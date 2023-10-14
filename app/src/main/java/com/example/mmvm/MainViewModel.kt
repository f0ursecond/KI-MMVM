package com.example.mmvm

import android.database.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = ObservableField(1)

    fun increaseCounter(){
        val currentCounter = counter.get()?:1
        counter.set(currentCounter + 1)
    }

    fun decreaseCounter() {
        val currentCounter = counter.get()?:1
        counter.set(currentCounter - 1)
    }

}
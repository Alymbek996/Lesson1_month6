package com.geektech.lesson1_month6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
private var mHistory=""
    private var mCounter = 0

    val history=MutableLiveData<String>()
    val counter = MutableLiveData<Int>()

    fun onIncrementClick(){
       mCounter++
        counter.value = mCounter
        mHistory="$mHistory\n+"
        history.value=mHistory
    }
    fun onDecrementClick(){
        --mCounter
        counter.value= mCounter
        mHistory="$mHistory\n-"
        history.value = mHistory
    }
}
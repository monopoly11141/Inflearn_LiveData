package com.example.inflearn_livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _countValue = MutableLiveData(0)
    val countValue : LiveData<Int>
        get() = _countValue

    fun plusCount() {
        _countValue.value = _countValue.value?.plus(1)
    }

    fun minusCount() {
        _countValue.value = _countValue.value?.minus(1)
    }

}
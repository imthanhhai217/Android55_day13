package com.devpro.android55_day11

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application:Application): AndroidViewModel(application) {

    val userName = MutableLiveData<String>()

    fun getUserInfo(){
        //Retrofit call api getUserInfo
        userName.value = "Hải"
    }
}
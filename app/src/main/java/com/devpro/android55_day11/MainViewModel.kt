package com.devpro.android55_day11

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.devpro.android55_day13.R

class MainViewModel(context: Context, application:Application): AndroidViewModel(application) {

    val userName = MutableLiveData<String?>(context.resources.getString(R.string.app_name))
    val age = MutableLiveData<Int>()

    fun getUserInfo(){
        //Retrofit call api getUserInfo
        userName.value = "Hải"
    }
}
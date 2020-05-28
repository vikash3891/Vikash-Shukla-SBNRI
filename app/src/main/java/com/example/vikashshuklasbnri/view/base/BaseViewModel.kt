package com.example.vikashshuklasbnri.view.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.vikashshuklasbnri.VikashShuklaSBNRIApp

open class BaseViewModel : ViewModel() {

    val empty = MutableLiveData<Boolean>().apply { value = false }

    val dataLoading = MutableLiveData<Boolean>().apply { value = false }

    val toastMessage = MutableLiveData<String>()
}
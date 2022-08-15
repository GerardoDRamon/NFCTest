package com.example.nfctest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val displayDensity: MutableLiveData<ArrayList<String>> = MutableLiveData()

    fun getDisplayMetricFromPixelsToDp(dmPixelsHeight: Int, dmPixelsWidth: Int, dmDensity: Float) {
        return displayDensity.postValue(
            arrayListOf(
                (dmPixelsHeight / dmDensity).toString(),
                (dmPixelsWidth / dmDensity).toString()
            )
        )
    }
}
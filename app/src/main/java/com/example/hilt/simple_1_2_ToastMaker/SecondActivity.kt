package com.example.hilt.simple_1_2_ToastMaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    @Inject
    lateinit var toastMaker : ToastMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toastMaker.showToast("text")
    }
}
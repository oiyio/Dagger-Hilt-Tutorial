package com.example.hilt.simple_1_2_ToastMaker

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ToastMaker @Inject constructor(@ApplicationContext var context: Context) {

    fun showToast(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
package com.example.hilt.simple_1_1_FieldInjection

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class User @Inject constructor(@ApplicationContext var mycontext: Context)
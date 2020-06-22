package com.example.hilt.simple_1_1_FieldInjection

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt.R
import com.example.hilt.simple_1_2_ToastMaker.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var user: User

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(Intent(baseContext,SecondActivity::class.java))
        }

        var editor =  sharedPreferences.edit()
        editor.putInt("testData1",1)
        editor.putInt("testData2",2)
        editor.apply()

        Toast.makeText(applicationContext,
                "user : " + user.toString() + " - " +
                        sharedPreferences.getInt("testData1",0) + " - " +
                        sharedPreferences.getInt("testData2",0)
                ,Toast.LENGTH_LONG).show()
    }
}

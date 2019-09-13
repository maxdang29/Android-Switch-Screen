package com.example.android_switch_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class screen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var userName: String = intent.getStringExtra("userName")
        val textUserName = findViewById<TextView>(R.id.userName)
        textUserName.setText(userName).toString()
    }
    fun goback(view: View) {
        finish()
    }
}

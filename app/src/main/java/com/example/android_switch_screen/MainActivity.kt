package com.example.android_switch_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnSwitch)

        button.setOnClickListener{
            val intent = Intent(this, screen2::class.java)
            var userName = "Nam"
            intent.putExtra("userName", userName)
            startActivity(intent);
        }
    }

}

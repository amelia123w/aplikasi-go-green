package com.example.go_green

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.go_green.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val btnLogin: Button = findViewById(id.btn1)

        btnLogin.setOnClickListener{
            val intent = Intent(this, RegisterActivity1::class.java)
            startActivity(intent)
        }
    }
}
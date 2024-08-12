package com.example.go_green

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.R_btn_1)

        btnLogin.setOnClickListener{
            val intent = Intent(this, RegisterActivity1::class.java)
            startActivity(intent)
        }
    }
}
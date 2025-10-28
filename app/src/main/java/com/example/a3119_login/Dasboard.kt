package com.example.a3119_login

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dasboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dasboard)
      val tv_ucapan : TextView = findViewById(R.id.tv_ucapan)

        val username = intent.getStringExtra("nama")

        tv_ucapan.text = "selamat datang: $username"
    }
}
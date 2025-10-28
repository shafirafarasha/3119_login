package com.example.a3119_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val et_username: EditText = findViewById(R.id.et_username)
        val et_password: EditText = findViewById( R.id.et_password)
        val btn_login: Button = findViewById(R.id.btn_login)
        val btn_register: Button = findViewById(R.id.btn_register)

        btn_login.setOnClickListener {
            val username = et_username.text.toString()
            val pindah: Intent = Intent(this, Dasboard::class.java)


            pindah.putExtra("nama", username)

            startActivity(pindah)
        }
        btn_register.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}
package com.example.a3119_login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, DashboardFragment())
            .commit()

        val tvWelcomeMessage: TextView = findViewById(R.id.tv_welcome_message)
        val btnOpenWebsite: Button = findViewById(R.id.btn_open_website)

        val username = intent.getStringExtra("EXTRA_USERNAME")
        tvWelcomeMessage.text = "Selamat Datang, $username!"

        btnOpenWebsite.setOnClickListener {

            val webpage: Uri = Uri.parse("https://amikom.ac.id")


            val intent = Intent(Intent.ACTION_VIEW, webpage)


            startActivity(intent)
        }
    }
}

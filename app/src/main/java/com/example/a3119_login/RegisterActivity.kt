package com.example.a3119_login

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        val rgGender: RadioGroup = findViewById(R.id.gender)
        val cbAgree: CheckBox = findViewById(R.id.ketentuan)
        val btnSubmit: Button = findViewById(R.id.btn_register)
        val spinnerDomisili: Spinner = findViewById(R.id.spinner_domisili)


        btnSubmit.setOnClickListener {
            val selectedId = rgGender.checkedRadioButtonId
            val gender = when (selectedId) {
                R.id.pria -> "Pria"
                R.id.wanita -> "Wanita"
                else -> "Belum dipilih"
            }
            val isAgreed = cbAgree.isChecked
            Toast.makeText(
                this,
                "Jenis Kelamin: $gender, Setuju: $isAgreed",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
    }


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
import android.widget.*


class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val gender: RadioGroup = findViewById(R.id.gender)
        val ketentuan: CheckBox = findViewById( R.id.ketentuan)
        val btn_login: Button = findViewById(R.id.btn_login)


        btn_login.setOnClickListener {
            val selectedId = gender.checkedRadioButtonId

            if (selectedId == -1) {
                Toast.makeText(this, "Pilih jenis kelamin!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedRadio = findViewById<RadioButton>(selectedId)
            val gender = selectedRadio.text.toString()
            val isChecked = ketentuan.isChecked

            if (!isChecked) {
                Toast.makeText(this, "Anda harus menyetujui syarat & ketentuan.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Jenis Kelamin: $gender, Persetujuan: $isChecked", Toast.LENGTH_LONG).show()
            }
        }
    }
}

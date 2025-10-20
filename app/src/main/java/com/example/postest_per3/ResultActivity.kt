package com.example.postest_per3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tampilFullName = findViewById<TextView>(R.id.tampilFullName)
        val tampilUsername = findViewById<TextView>(R.id.tampilUsername)
        val tampilAge = findViewById<TextView>(R.id.tampilAge)
        val tampilEmail = findViewById<TextView>(R.id.tampilEmail)
        val tampilGender = findViewById<TextView>(R.id.tampilGender)

        tampilFullName.text = "Full Name: ${intent.getStringExtra("FULLNAME")}"
        tampilUsername.text = "Username: ${intent.getStringExtra("USERNAME")}"
        tampilAge.text = "Age: ${intent.getStringExtra("AGE")}"
        tampilEmail.text = "Email: ${intent.getStringExtra("EMAIL")}"
        tampilGender.text = "Gender: ${intent.getStringExtra("GENDER")}"
    }
}

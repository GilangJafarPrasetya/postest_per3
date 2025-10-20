package com.example.postest_per3

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputFullName = findViewById<EditText>(R.id.inputFullName)
        val inputUsername = findViewById<EditText>(R.id.inputUsername)
        val inputAge = findViewById<EditText>(R.id.inputAge)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)
        val radioGender = findViewById<RadioGroup>(R.id.radioGender)
        val inputPassword = findViewById<EditText>(R.id.inputPassword)
        val inputConfirmPassword = findViewById<EditText>(R.id.inputConfirmPassword)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val fullName = inputFullName.text.toString().trim()
            val username = inputUsername.text.toString().trim()
            val age = inputAge.text.toString().trim()
            val email = inputEmail.text.toString().trim()
            val password = inputPassword.text.toString().trim()
            val confirmPassword = inputConfirmPassword.text.toString().trim()

            val selectedGenderId = radioGender.checkedRadioButtonId
            val gender = if (selectedGenderId != -1) {
                findViewById<RadioButton>(selectedGenderId).text.toString()
            } else {
                ""
            }

            if (fullName.isEmpty() || username.isEmpty() || age.isEmpty() || email.isEmpty()
                || password.isEmpty() || confirmPassword.isEmpty() || gender.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Password dan Konfirmasi Password Gak Cocok BREEEE!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("FULLNAME", fullName)
            intent.putExtra("USERNAME", username)
            intent.putExtra("AGE", age)
            intent.putExtra("EMAIL", email)
            intent.putExtra("GENDER", gender)
            startActivity(intent)
        }
    }
}

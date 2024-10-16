package com.example.app_ca1

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var regno = findViewById<EditText>(R.id.userid)
        var submitbtn = findViewById<Button>(R.id.submit)
        var forgotbtn = findViewById<Button>(R.id.fpassword)

        submitbtn.setOnClickListener {
            showToast("Login Successful")
        }

    }
    private fun showToast(message: String){
        android.widget.Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}
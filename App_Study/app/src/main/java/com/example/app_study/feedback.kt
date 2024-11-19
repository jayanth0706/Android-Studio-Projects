package com.example.app_study

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class feedback : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)

        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener {
            Toast.makeText(this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show()
        }

    }
}
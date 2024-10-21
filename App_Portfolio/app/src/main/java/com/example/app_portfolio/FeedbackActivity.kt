package com.example.app_portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)

        val submitButton = findViewById<Button>(R.id.submitButton)
        val homeButton = findViewById<Button>(R.id.homeButton)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Feedback submitted!", Toast.LENGTH_SHORT).show()
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
            finish()
        }

    }
}
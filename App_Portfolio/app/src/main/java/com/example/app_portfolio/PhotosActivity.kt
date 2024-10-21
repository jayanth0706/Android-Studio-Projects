package com.example.app_portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PhotosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_photos)

        val homeButton = findViewById<Button>(R.id.ibtn1)
        homeButton.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
        }

    }
}
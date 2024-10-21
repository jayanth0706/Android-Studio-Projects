package com.example.app_portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AcademicsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_academics)

        val abtn1 = findViewById<Button>(R.id.abtn1)
        abtn1.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
        }

    }
}
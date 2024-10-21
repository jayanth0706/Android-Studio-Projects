package com.example.app_portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skills)

        val btn = findViewById<Button>(R.id.cbtn1)
        btn.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
        }

    }
}
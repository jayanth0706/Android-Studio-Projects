package com.example.app_study

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val checkbox1 = findViewById<CheckBox>(R.id.cb1)
        val button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            if (checkbox1.isChecked) {
                val intent = Intent(this, dashboard::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please check the 'Remember me' box", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
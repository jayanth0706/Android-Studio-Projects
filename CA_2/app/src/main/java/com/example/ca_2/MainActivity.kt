package com.example.ca_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn1)

        button.setOnClickListener {
            Toast.makeText(this, "Conform Data Reception", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }

    }
}
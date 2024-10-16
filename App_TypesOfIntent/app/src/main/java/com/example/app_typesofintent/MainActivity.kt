package com.example.app_typesofintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ExplicitIntentbtn = findViewById<Button>(R.id.expbtn1)
        val ImplicitIntentbtn = findViewById<Button>(R.id.impbtn1)

        ExplicitIntentbtn.setOnClickListener {
            val intent = Intent(this, ExplicitIntent::class.java)
            startActivity(intent)
        }

        ImplicitIntentbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }

    }
}
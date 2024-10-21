package com.example.app_portfolio

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CertificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_certifications)

        val course1linkTextView = findViewById<TextView>(R.id.course1link)
        course1linkTextView.movementMethod = LinkMovementMethod.getInstance()

        val course2linkTextView = findViewById<TextView>(R.id.course2link)
        course2linkTextView.movementMethod = LinkMovementMethod.getInstance()

        val cbtn1 = findViewById<Button>(R.id.cbtn1)
        cbtn1.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
        }

    }
}
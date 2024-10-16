package com.example.app_snackbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val snackbarbtn = findViewById<Button>(R.id.btn1)

        snackbarbtn.setOnClickListener { view ->
            Snackbar.make(view, "This is a snackbar", Snackbar.LENGTH_LONG).setAction("Undo") {
                Toast.makeText(this, "Undo was clicked", Toast.LENGTH_SHORT).show()
            }.show()

        }
    }
}
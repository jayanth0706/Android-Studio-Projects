package com.example.app_alertbox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val alertButton1 = findViewById<Button>(R.id.btn2)
        alertButton1.setOnClickListener {
            val alertBox1 = AlertDialog.Builder(this)
            alertBox1.setTitle("Exit")
            alertBox1.setMessage("Are you sure you want to exit?")
            alertBox1.setCancelable(false)
            alertBox1.setPositiveButton("Yes") { dialog, _ ->
                val intent = Intent(this, RatingBar::class.java)
                startActivity(intent)
            }
            alertBox1.setNeutralButton("Cancel") { dialog, _ ->
                dialog.dismiss()
                // Show reminder Toast after starting the activity
                Toast.makeText(this, "Remember to rate the app!", Toast.LENGTH_SHORT).show()
            }
            alertBox1.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            alertBox1.create()
            alertBox1.show()
        }
    }
}
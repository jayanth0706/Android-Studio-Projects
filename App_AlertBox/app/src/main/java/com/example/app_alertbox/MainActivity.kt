package com.example.app_alertbox

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var alertButton1 = findViewById<Button>(R.id.btn1)
        alertButton1.setOnClickListener {
            var alertBox = AlertDialog.Builder(this) // AlertDialog.Builder is a Classes
            alertBox.setTitle("Exit")
            alertBox.setMessage("Are you sure you want to exit?")
            alertBox.setCancelable(false) // If we click anywhere outside the box it will not close
            alertBox.setPositiveButton("Yes") { dialog, _ ->
                finish()
            }
            alertBox.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            alertBox.create()
            alertBox.show()
        }


    }
}
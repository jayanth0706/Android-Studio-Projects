package com.example.app_popmenu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn1)

        button.setOnClickListener { view ->
            val pop = PopupMenu(this, view)
            pop.inflate(R.menu.menu)

            pop.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.share -> {
                        Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.delete -> {
                        Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }

            pop.show()
        }
    }
}
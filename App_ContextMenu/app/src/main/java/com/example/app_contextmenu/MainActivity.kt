package com.example.app_contextmenu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var imagebtn1 = findViewById<ImageView>(R.id.imageview)
        registerForContextMenu(imagebtn1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onContextItemSelected(item: MenuItem): Boolean {
        var imagebtn2 = findViewById<ImageView>(R.id.imageview)
            return when (item.itemId) {
                R.id.ChangeColor -> {
                    imagebtn2.setColorFilter(R.color.black)
                    Toast.makeText(this, "Sucessfully Color Changed", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.Rotation -> {
                    imagebtn2.rotation = 90f
                    Toast.makeText(this, "Sucessfully Rotated", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> super.onContextItemSelected(item)
            }
        }
}
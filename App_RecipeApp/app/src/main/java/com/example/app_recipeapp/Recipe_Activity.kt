package com.example.app_recipeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Recipe_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recipe)
        val toolbar1 = findViewById<Toolbar>(R.id.toolbar1)
        setSupportActionBar(toolbar1)

        val imagebutton1 = findViewById<ImageButton>(R.id.ibtn1)
        imagebutton1.setOnClickListener { view ->
            val ppbfMenu = PopupMenu(this, view)
            ppbfMenu.inflate(R.menu.bfmenu)
            ppbfMenu.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.item1 -> {
                        val intent = Intent(this, dosa::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item2 -> {
                        val intent = Intent(this, idly::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item3 -> {
                        val intent = Intent(this, vada::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            ppbfMenu.show()
        }
        val imagebutton2 = findViewById<ImageButton>(R.id.ibtn2)
        imagebutton2.setOnClickListener { view ->
            val ppLunchMenu = PopupMenu(this, view)
            ppLunchMenu.inflate(R.menu.lunchmenu)
            ppLunchMenu.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.item1 -> {
                        val intent = Intent(this, chickenbiryani::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item2 -> {
                        val intent = Intent(this, muttonbiryani::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item3 -> {
                        val intent = Intent(this, chickenmandi::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item4 -> {
                        val intent = Intent(this, muttonmandi::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            ppLunchMenu.show()
        }

        val imagebutton3 = findViewById<ImageButton>(R.id.ibtn33)
        imagebutton3.setOnClickListener { view ->
            val ppSnacksMenu = PopupMenu(this, view)
            ppSnacksMenu.inflate(R.menu.snacksmenu)
            ppSnacksMenu.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.item1 -> {
                        val intent = Intent(this, paneer::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item2 -> {
                        val intent = Intent(this, samosa::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            ppSnacksMenu.show()
        }



        val imagebutton4 = findViewById<ImageButton>(R.id.ibtn44)
        imagebutton4.setOnClickListener { view ->
            val ppDinnerMenu = PopupMenu(this, view)
            ppDinnerMenu.inflate(R.menu.dinnermenu)
            ppDinnerMenu.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.item1 -> {
                        val intent = Intent(this, chickenbiryani::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item2 -> {
                        val intent = Intent(this, muttonbiryani::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item3 -> {
                        val intent = Intent(this, chickenmandi::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.item4 -> {
                        val intent = Intent(this, muttonmandi::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            ppDinnerMenu.show()
        }









    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
}

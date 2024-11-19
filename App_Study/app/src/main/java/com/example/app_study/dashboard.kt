package com.example.app_study

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        val toolbar = findViewById<Toolbar>(R.id.tb1)
        setSupportActionBar(toolbar)
        val button1 = findViewById<Button>(R.id.tv2)
        val button2 = findViewById<Button>(R.id.tv3)
        val button3 = findViewById<Button>(R.id.tv4)
        val button4 = findViewById<Button>(R.id.tv5)
        val button5 = findViewById<Button>(R.id.tv6)
        val button6 = findViewById<Button>(R.id.tv7)

        button1.setOnClickListener {
            val intent = Intent(this, startpreparing::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, discuss::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, olympiad::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, yourcareerpath::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, credits::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, feedback::class.java)
            startActivity(intent)
        }




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.dashboardmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.java -> {
                val intent = Intent(this, java::class.java)
                startActivity(intent)
                true
            }
            R.id.dsa -> {
                val intent = Intent(this, dsa::class.java)
                startActivity(intent)
                true
            }
            R.id.dbms -> {
                val intent = Intent(this, dbms::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
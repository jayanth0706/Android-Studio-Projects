package com.example.app_portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class menu_main : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_main)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val academics = findViewById<ImageButton>(R.id.btn1)
        val certifications = findViewById<ImageButton>(R.id.btn2)
        val hobbies = findViewById<ImageButton>(R.id.btn3)
        val projects = findViewById<ImageButton>(R.id.btn4)
        val photos = findViewById<ImageButton>(R.id.btn5)
        val skills = findViewById<ImageButton>(R.id.btn6)

        academics.setOnClickListener {
            val intent = Intent(this, AcademicsActivity::class.java)
            startActivity(intent)
        }
        certifications.setOnClickListener {
            val intent = Intent(this, CertificationsActivity::class.java)
            startActivity(intent)
        }
        hobbies.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
        projects.setOnClickListener {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }
        photos.setOnClickListener {
            val intent = Intent(this, PhotosActivity::class.java)
            startActivity(intent)
        }
        skills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.email -> {
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("your_email@example.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Subject")
                    putExtra(Intent.EXTRA_TEXT, "Body")
                }
                startActivity(emailIntent)
                true
            }
            R.id.contact -> {
                val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:9087987987")
                }
                startActivity(dialIntent)
                true
            }
            R.id.feedback -> {
                val feedbackIntent = Intent(this, FeedbackActivity::class.java)
                startActivity(feedbackIntent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
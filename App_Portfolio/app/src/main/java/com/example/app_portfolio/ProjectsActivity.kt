package com.example.app_portfolio

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_projects)

        val project1link = findViewById<TextView>(R.id.project1link)
        project1link.movementMethod = LinkMovementMethod.getInstance()

        val project2link = findViewById<TextView>(R.id.project2link)
        project2link.movementMethod = LinkMovementMethod.getInstance()

        val projectbtn = findViewById<Button>(R.id.pbtn1)
        projectbtn.setOnClickListener {
            val intent = Intent(this, menu_main::class.java)
            startActivity(intent)
        }

    }
}
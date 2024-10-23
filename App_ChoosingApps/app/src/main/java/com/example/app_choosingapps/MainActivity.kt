package com.example.app_choosingapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val share = findViewById<Button>(R.id.btn1)
        share.setOnClickListener {
            sharetext("Hello World")
        }
    }
        fun sharetext(message: String){
            val send = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, message)
                type = "text/plain"
            }
        val chooser = Intent.createChooser(send, "share using")
        startActivity(chooser)
    }
}
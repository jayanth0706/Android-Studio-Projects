package com.example.app_snackbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class layout_stream_detail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Get the stream name and image from the intent
        val streamName = intent.getStringExtra("stream_name")
        val streamImageResId = intent.getIntExtra("stream_image", 0)

        // Find the TextView and ImageView
        val streamNameTextView = findViewById<TextView>(R.id.streamTitle)
        val streamImageView = findViewById<ImageView>(R.id.streamImage)

        // Set the stream name and image
        streamNameTextView.text = "You selected $streamName"
        streamImageView.setImageResource(streamImageResId)


    }
}
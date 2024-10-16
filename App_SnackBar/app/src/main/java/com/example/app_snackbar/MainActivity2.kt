package com.example.app_snackbar

import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initializing views
        val snackbargl = findViewById<GridLayout>(R.id.sbgl1)
        val snackbarbtn1 = findViewById<ImageButton>(R.id.sbibtn1)
        val snackbarbtn2 = findViewById<ImageButton>(R.id.sbibtn2)
        val snackbarbtn3 = findViewById<ImageButton>(R.id.sbibtn3)
        val snackbarbtn4 = findViewById<ImageButton>(R.id.sbibtn4)
        val snackbarbtn5 = findViewById<ImageButton>(R.id.sbibtn5)
        val snackbarbtn6 = findViewById<ImageButton>(R.id.sbibtn6)

        // Setting click listeners for each button
        snackbarbtn1.setOnClickListener { view ->
            Snackbar.make(view, "You selected MBA", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("MBA", R.drawable.mba)
            }.show()
        }
        snackbarbtn2.setOnClickListener { view ->
            Snackbar.make(view, "You selected EEE", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("EEE", R.drawable.eee)
            }.show()
        }
        snackbarbtn3.setOnClickListener { view ->
            Snackbar.make(view, "You selected MECH", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("MECH", R.drawable.mech)
            }.show()
        }
        snackbarbtn4.setOnClickListener { view ->
            Snackbar.make(view, "You selected IT", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("IT", R.drawable.it)
            }.show()
        }
        snackbarbtn5.setOnClickListener { view ->
            Snackbar.make(view, "You selected BUSINESS", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("BUSINESS", R.drawable.business)
            }.show()
        }
        snackbarbtn6.setOnClickListener { view ->
            Snackbar.make(view, "You selected CIVIL", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("CIVIL", R.drawable.civil)
            }.show()
        }
    }

    private fun openStreamDetail(streamName: String, imageResId: Int) {
        setContentView(R.layout.layout_stream_detail)
        val streamTitle = findViewById<TextView>(R.id.streamTitle)
        val streamImage = findViewById<ImageView>(R.id.streamImage)

        // Set the title and image based on the stream selected
        streamTitle.text = "You selected $streamName Stream in B.Tech"
        streamImage.setImageResource(imageResId)
    }
}

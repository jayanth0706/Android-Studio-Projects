package com.example.shopping_app

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.RatingBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // for Splash Screen
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        val toolbar1 = findViewById<androidx.appcompat.widget.Toolbar>(R.id.tb1)
        val image1 = findViewById<ImageView>(R.id.iv1)
        val image2 = findViewById<ImageView>(R.id.iv2)
        val image3 = findViewById<ImageView>(R.id.iv3)
        val image4 = findViewById<ImageView>(R.id.iv4)
        val rating1 = findViewById<RatingBar>(R.id.rb1)
        val rating2 = findViewById<RatingBar>(R.id.rb2)
        val rating3 = findViewById<RatingBar>(R.id.rb3)
        val rating4 = findViewById<RatingBar>(R.id.rb4)
        val edit1 = findViewById<EditText>(R.id.ed1)
        val edit2 = findViewById<EditText>(R.id.ed2)
        val edit3 = findViewById<EditText>(R.id.ed3)
        val edit4 = findViewById<EditText>(R.id.ed4)

        rating1.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {_, rating, _ ->
            edit1.setText(rating.toString())
        }
        rating2.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {_, rating, _ ->
            edit2.setText(rating.toString())
        }
        rating3.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {_, rating, _  ->
            edit3.setText(rating.toString())
        }
        rating4.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener {_, rating, _ ->
            edit4.setText(rating.toString())
        }
    }
}
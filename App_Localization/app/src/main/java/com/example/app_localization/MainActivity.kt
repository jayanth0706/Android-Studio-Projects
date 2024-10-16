package com.example.app_localization

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var textViewAppName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize TextView
        textViewAppName = findViewById(R.id.tv1)

        // Button references
        val buttonTelugu = findViewById<Button>(R.id.button1)
        val buttonTamil = findViewById<Button>(R.id.button2)
        val buttonHindi = findViewById<Button>(R.id.button3)

        // Button click listeners
        buttonTelugu.setOnClickListener {
            setLocale("te")
        }

        buttonTamil.setOnClickListener {
            setLocale("ta")
        }

        buttonHindi.setOnClickListener {
            setLocale("hi")
        }
    }

    private fun setLocale(langCode: String) {
        val currentLang = resources.configuration.locales[0].language

        // Check if the selected language is different from the current language
        if (langCode != currentLang) {
            val locale = Locale(langCode)
            Locale.setDefault(locale)
            val config = Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config, resources.displayMetrics)

            // Update the TextView's text manually to reflect changes immediately
            textViewAppName.text = getString(R.string.app_name) // or any other text you need to update

            // Restart the activity to apply the new locale
            recreate()
        }
    }
}

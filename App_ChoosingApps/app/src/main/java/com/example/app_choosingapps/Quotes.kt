package com.example.app_choosingapps

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Quotes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quotes)

        val checkbox1 = findViewById<CheckBox>(R.id.cb1)
        val checkbox2 = findViewById<CheckBox>(R.id.cb2)
        val checkbox3 = findViewById<CheckBox>(R.id.cb3)
        val checkbox4 = findViewById<CheckBox>(R.id.cb4)
        val shareButton = findViewById<Button>(R.id.qbtn1)

        shareButton.setOnClickListener {
            val selectedQuotes = mutableListOf<String>()
            if (checkbox1.isChecked) selectedQuotes.add(checkbox1.text.toString())
            if (checkbox2.isChecked) selectedQuotes.add(checkbox2.text.toString())
            if (checkbox3.isChecked) selectedQuotes.add(checkbox3.text.toString())
            if (checkbox4.isChecked) selectedQuotes.add(checkbox4.text.toString())

            if (selectedQuotes.isNotEmpty()) {
                val quotesToShare = selectedQuotes.joinToString("\n")
                copyToClipboard(quotesToShare)
                shareToBrowser(quotesToShare)
            } else {
                Toast.makeText(this, "Please select at least one quote", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun copyToClipboard(text: String) {
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Quotes", text)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(this, "Quotes copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    private fun shareToBrowser(text: String) {
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}
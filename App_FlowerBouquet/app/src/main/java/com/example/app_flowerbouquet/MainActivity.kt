package com.example.app_flowerbouquet

import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var radioGroup1 = findViewById<RadioGroup>(R.id.frg1)
        var radioGroup2 = findViewById<RadioGroup>(R.id.frg2)

        var radiobutton1 = findViewById<RadioButton>(R.id.frb1)
        var radiobutton2 = findViewById<RadioButton>(R.id.frb2)
        var radiobutton3 = findViewById<RadioButton>(R.id.frb3)
        var radiobutton4 = findViewById<RadioButton>(R.id.frb4)

        var checkbox1 = findViewById<CheckBox>(R.id.fcb1)
        var button1 = findViewById<Button>(R.id.fbtn1)

        var selected_bouquet = ""
        radioGroup1.setOnCheckedChangeListener { _, checkedId ->
            selected_bouquet = when(checkedId) {
                R.id.frb1 -> "Bouquet 1"
                R.id.frb2 -> "Bouquet 2"
                else -> ""
            }
        }

        var selected_option =""
        radioGroup2.setOnCheckedChangeListener { _, checkedId ->
            selected_option = when(checkedId) {
                R.id.frb3 -> "Order"
                R.id.frb4 -> "TakeAway"
                else -> ""
            }
        }

        button1.setOnClickListener {

            var agree = checkbox1.isChecked
            if(selected_bouquet.isEmpty() && selected_option.isEmpty() ) {
                showToast("Select Both Bouquet and Order Type..")
            }
            else if(!checkbox1.isChecked){
                showToast("Check Agree And Continue")
            }
            else {
                showToast("Selected Bouquet is $selected_bouquet \nSelected Bouquet order type is $selected_option")
            }
        }


    }

    private fun showToast(message: String){
        android.widget.Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}
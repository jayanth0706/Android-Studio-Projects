package com.example.app_radiocheckbox_backend

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val largeRadioButton = findViewById<RadioButton>(R.id.radioButton2)
        val mediumRadioButton = findViewById<RadioButton>(R.id.radioButton3)
        val smallRadioButton = findViewById<RadioButton>(R.id.radioButton4)
        val cheeseCheckBox = findViewById<CheckBox>(R.id.checkBox)
        val sausageCheckBox = findViewById<CheckBox>(R.id.checkBox2)
        val pepperoniCheckBox = findViewById<CheckBox>(R.id.checkBox3)
        val agreeCheckBox = findViewById<CheckBox>(R.id.checkBox4)
        val submitButton = findViewById<MaterialButton>(R.id.submitButton)

        // Declares a variable pizzaSize to hold the size of the pizza selected by the user.
        var pizzaSize = ""

        // Set listener for the RadioGroup to capture the selected pizza size
        // In Kotlin, the underscore (_) is used as a placeholder for an unused variable.
        // The checkedId parameter in the setOnCheckedChangeListener method of RadioGroup is used to identify which RadioButton within the RadioGroup has been selected.
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            pizzaSize = when (checkedId) {
                R.id.radioButton2 -> "Large"
                R.id.radioButton3 -> "Medium"
                R.id.radioButton4 -> "Small"
                else -> ""
            }
        }

        // Set listener for the Submit button
        submitButton.setOnClickListener {
            val selectedToppings = mutableListOf<String>()

            if (cheeseCheckBox.isChecked) selectedToppings.add("Cheese")
            if (sausageCheckBox.isChecked) selectedToppings.add("Sausage")
            if (pepperoniCheckBox.isChecked) selectedToppings.add("Pepperoni")

            val agreedToTerms = agreeCheckBox.isChecked

            // Validate selections
            if (pizzaSize.isEmpty()) {
                // Handle the case where no size is selected
                showToast("Please select a pizza size.")
            } else if (!agreedToTerms) {
                // Handle the case where the user hasn't agreed to the terms
                showToast("Please agree to continue.")
            } else {
                // Submit the pizza order with selected size and toppings
                val toppings = if (selectedToppings.isEmpty()) "No toppings" else selectedToppings.joinToString(", ")
                showToast("Pizza size: $pizzaSize\nToppings: $toppings")
            }
        }
    }

    // A helper method to show a toast message
    private fun showToast(message: String) {
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show()
    }

}

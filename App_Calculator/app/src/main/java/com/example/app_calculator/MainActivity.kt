package com.example.app_calculator

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var inputTextView: TextView
    private lateinit var outputTextView: TextView

    private var inputString: String = ""
    private var lastNumeric: Boolean = false
    private var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputTextView = findViewById(R.id.inputtext)
        outputTextView = findViewById(R.id.outputtext)

        val buttonClear = findViewById<MaterialButton>(R.id.bclear)
        val buttonClearAll = findViewById<MaterialButton>(R.id.bclearall)
        val buttonDivide = findViewById<MaterialButton>(R.id.bdivide)
        val buttonMultiply = findViewById<MaterialButton>(R.id.bmulti)
        val buttonAdd = findViewById<MaterialButton>(R.id.bplus)
        val buttonSubtract = findViewById<MaterialButton>(R.id.bminus)
        val buttonEqual = findViewById<MaterialButton>(R.id.bequal)
        val buttonDot = findViewById<MaterialButton>(R.id.bdot)
        val buttonZero = findViewById<MaterialButton>(R.id.bzero)
        val buttonOne = findViewById<MaterialButton>(R.id.bone)
        val buttonTwo = findViewById<MaterialButton>(R.id.btwo)
        val buttonThree = findViewById<MaterialButton>(R.id.bthree)
        val buttonFour = findViewById<MaterialButton>(R.id.bfour)
        val buttonFive = findViewById<MaterialButton>(R.id.bfive)
        val buttonSix = findViewById<MaterialButton>(R.id.bsix)
        val buttonSeven = findViewById<MaterialButton>(R.id.bseven)
        val buttonEight = findViewById<MaterialButton>(R.id.beight)
        val buttonNine = findViewById<MaterialButton>(R.id.bnine)
        val buttonOpen = findViewById<MaterialButton>(R.id.bopen)
        val buttonClose = findViewById<MaterialButton>(R.id.bclose)

        // Number Button Setup
        val numberButtons = arrayOf(
            buttonZero, buttonOne, buttonTwo, buttonThree,
            buttonFour, buttonFive, buttonSix, buttonSeven,
            buttonEight, buttonNine
        )

        // Purpose: Creates an array containing all number buttons for easier iteration.
        //Purpose: Sets up a click listener for each number button. When a number button is clicked,
        // it calls the onDigit function with the button's text.
        numberButtons.forEach { button ->
            button.setOnClickListener {
                onDigit(button.text.toString())
            }
        }

        // Dot Button
        buttonDot.setOnClickListener {
            if (lastNumeric && !lastDot) {
                inputString += "."
                inputTextView.text = inputString
                lastNumeric = false
                lastDot = true
            }
        }

        buttonClear.setOnClickListener {
            if (inputString.isNotEmpty()) {
                inputString = inputString.dropLast(1)
                inputTextView.text = inputString
            }
        }

        buttonClearAll.setOnClickListener {
            inputString = ""
            outputTextView.text = ""
            inputTextView.text = ""
            lastNumeric = false
            lastDot = false
        }

        buttonAdd.setOnClickListener { onOperator(buttonAdd.text.toString()) }
        buttonSubtract.setOnClickListener { onOperator(buttonSubtract.text.toString()) }
        buttonMultiply.setOnClickListener { onOperator(buttonMultiply.text.toString()) }
        buttonDivide.setOnClickListener { onOperator(buttonDivide.text.toString()) }
        buttonOpen.setOnClickListener { onOperator(buttonOpen.text.toString()) }
        buttonClose.setOnClickListener { onOperator(buttonClose.text.toString()) }

        buttonEqual.setOnClickListener {
            if (lastNumeric) {
                val expression = ExpressionBuilder(inputString).build()
                try {
                    val result = expression.evaluate()
                    outputTextView.text = result.toString()
                    inputString = result.toString()
                    lastDot = true
                } catch (e: Exception) {
                    Log.e("CalculatorError", "Error evaluating expression: ${e.message}", e)
                    outputTextView.text = "Error"
                }
            }
        }
    }

    private fun onDigit(digit: String) {
        if (inputString == "Error") {
            inputString = ""
        }
        inputString += digit
        inputTextView.text = inputString
        lastNumeric = true
        lastDot = false
    }

    private fun onOperator(operator: String) {
        if (lastNumeric && !isOperator(inputString.last())) {
            inputString += operator
            inputTextView.text = inputString
            lastNumeric = false
            lastDot = false
        } else if (inputString.isNotEmpty() && isOperator(inputString.last())) {
            inputString = inputString.dropLast(1) + operator
            inputTextView.text = inputString
            lastNumeric = false
            lastDot = false
        }
    }

    private fun isOperator(character: Char): Boolean {
        return character == '+' || character == '-' || character == '*' || character == '/'
    }
}

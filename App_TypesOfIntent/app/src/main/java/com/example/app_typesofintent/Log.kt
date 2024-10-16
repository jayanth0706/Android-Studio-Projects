package com.example.app_typesofintent

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "LogActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        val logcatBtn = findViewById<Button>(R.id.logcatbtn1)

        logcatBtn.setOnClickListener {
            // Logging with different levels
            Log.v(TAG, "Verbose.Log: Lowest priority, detailed entry, not for production")
            Log.d(TAG, "Debug.Log: High priority, detailed, useful during development")
            Log.i(TAG, "Info.Log: Moderate importance, provides information about the app")
            Log.w(TAG, "Warning.Log: Warning message for unexpected behavior")
            Log.e(TAG, "Error.Log: Error message indicating a failure")
        }
    }
}

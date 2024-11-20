package com.example.app_ca3

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

                val a = findViewById<TextView>(R.id.txtview)

                a.setOnClickListener { view ->
                    val popup = PopupMenu(this, view)

                    popup.menuInflater.inflate(R.menu.ppmenu, popup.menu)

                    popup.setOnMenuItemClickListener { item ->
                        when (item.itemId) {
                            R.id.delete -> {
                                val builder = AlertDialog.Builder(this)
                                builder.setTitle("Confirm")
                                builder.setMessage("Do you want to delete this item?")
                                builder.setPositiveButton("Yes") { dialog, _ ->
                                    (a.parent as? ViewGroup)?.removeView(a)
                                    dialog.dismiss()
                                }
                                builder.setNegativeButton("No") { dialog, _ ->
                                    dialog.dismiss()
                                }
                                builder.create().show()
                                true
                            }
                            else -> false
                        }
                    }
                    popup.show()
                }
    }
}


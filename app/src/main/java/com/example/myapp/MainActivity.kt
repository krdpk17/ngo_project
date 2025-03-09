package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var clickButton: Button
    private lateinit var welcomeText: TextView
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickButton = findViewById(R.id.clickButton)
        welcomeText = findViewById(R.id.welcomeText)

        clickButton.setOnClickListener {
            clickCount++
            Toast.makeText(this, "Button clicked $clickCount times!", Toast.LENGTH_SHORT).show()
        }
    }
} 
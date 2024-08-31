package com.example.myapplicationspinner

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val spinid = findViewById<Spinner>(R.id.spinner)

        val country = arrayOf("india","pakistan","bangaladesh","Bhutan","Pakistan" , "Nepal","Maldives", "Bangladesh", "and Sri Lank")

        val arrayAda = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, country)
        spinid.adapter = arrayAda

    }
}
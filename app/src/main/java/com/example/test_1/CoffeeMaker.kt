package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CoffeeMaker : AppCompatActivity() {

    lateinit var btnCM: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_maker)

        btnCM = findViewById(R.id.btnCM)
        btnCM.setOnClickListener {
            Toast.makeText(this, "Your coffee will be ready in 5 minutes", Toast.LENGTH_LONG).show()
            finish()
        }

    }
}
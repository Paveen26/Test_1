package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Lights : AppCompatActivity() {

    lateinit var btnSL1: Switch
    lateinit var btnSL2: Switch
    lateinit var btnSL3: Switch
    lateinit var btnSL4: Switch
    lateinit var btnSL5: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lights)

        btnSL1 = findViewById(R.id.btnSL1)
        btnSL2 = findViewById(R.id.btnSL2)
        btnSL3 = findViewById(R.id.btnSL3)
        btnSL4 = findViewById(R.id.btnSL4)
        btnSL5 = findViewById(R.id.btnSL5)

        btnSL1.setOnClickListener {
            if (btnSL1.isChecked){
                Toast.makeText(this, "Living Room lights is ON", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Living Room lights is OFF", Toast.LENGTH_SHORT).show()
            }

        }

        btnSL2.setOnClickListener {
            if (btnSL2.isChecked){
                Toast.makeText(this, "Garden Lanterns lights is ON", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Garden Lanterns lights is OFF", Toast.LENGTH_SHORT).show()
            }


        }

        btnSL2.setOnClickListener {
            val database = Firebase.database
            val myRef = database.getReference("Garden Lights")
            myRef.setValue("On")
        }

        btnSL3.setOnClickListener {
            if (btnSL3.isChecked){
                Toast.makeText(this, "Bedroom 1 lights is ON", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Bedroom 1 lights is OFF", Toast.LENGTH_SHORT).show()
            }

        }

        btnSL4.setOnClickListener {
            if (btnSL4.isChecked){
                Toast.makeText(this, "Bedroom 2 lights is ON", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Bedroom 2 lights is OFF", Toast.LENGTH_SHORT).show()
            }

        }

        btnSL5.setOnClickListener {
            if (btnSL5.isChecked){
                Toast.makeText(this, "Kitchen lights is ON", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Kitchen lights is OFF", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
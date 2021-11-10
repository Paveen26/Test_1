package com.example.test_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var btnM1: Button
    lateinit var btnM2: Button
    lateinit var btnM3: Button
    lateinit var btnM4: Button
    lateinit var btnM5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*btnM = findViewById(R.id.btnM)
        myRef = FirebaseDatabase.getInstance().reference

        btnM.setOnClickListener{
            myRef.child("abc").setValue("message123")
        }*/

        btnM1 = findViewById(R.id.btnM1)
        btnM2 = findViewById(R.id.btnM2)
        btnM3 = findViewById(R.id.btnM3)
        btnM4 = findViewById(R.id.btnM4)
        btnM5 = findViewById(R.id.btnM5)


        btnM1.setOnClickListener {
            val intent = Intent(this, Lights::class.java)
            startActivity(intent)
        }

        btnM2.setOnClickListener {
            val intent = Intent(this, Gates::class.java)
            startActivity(intent)
        }

        btnM3.setOnClickListener {
            val intent = Intent(this, CoffeeMaker::class.java)
            startActivity(intent)
        }

        /*btnM4.setOnClickListener {
            val intent = Intent(this, CCTV::class.java)
            startActivity(intent)
        }*/

        btnM5.setOnClickListener {
            val intent = Intent(this, AirConditioner::class.java)
            startActivity(intent)
        }

    }
}
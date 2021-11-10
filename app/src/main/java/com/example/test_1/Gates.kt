package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Gates : AppCompatActivity() {

    lateinit var btnG1: Button
    lateinit var btnG2: Button
    lateinit var btnG3: Button
    lateinit var btnG4: Button
    lateinit var btnG5: Button
    lateinit var btnG6: Button
    lateinit var btnG7: Button
    lateinit var myRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gates)

        btnG1 = findViewById(R.id.btnG1)
        btnG2 = findViewById(R.id.btnG2)
        btnG3 = findViewById(R.id.btnG3)
        btnG4 = findViewById(R.id.btnG4)
        btnG5 = findViewById(R.id.btnG5)
        btnG6 = findViewById(R.id.btnG6)
        btnG7 = findViewById(R.id.btnG7)
        myRef = FirebaseDatabase.getInstance().reference

        //Main Gate
        btnG1.setOnClickListener {
            Toast.makeText(this, "Gates are opening !", Toast.LENGTH_SHORT).show()
            /*val database = Firebase.database
            val myRef = database.getReference("Main Gate")
            myRef.setValue("Opening")*/

            myRef.child("Gates").setValue("Opening")

            /*val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)*/
        }

        btnG2.setOnClickListener {
            Toast.makeText(this, "Gates stopped !", Toast.LENGTH_SHORT).show()
            myRef.child("Gates").setValue("Stopped")
        }

        btnG3.setOnClickListener {
            Toast.makeText(this, "Gates closing !", Toast.LENGTH_SHORT).show()
            myRef.child("Gates").setValue("Closing")
        }

        //Left Gate
        btnG4.setOnClickListener {
            Toast.makeText(this, "Left gate is opening !", Toast.LENGTH_SHORT).show()
            myRef.child("Left Gate").setValue("Opening")
        }

        btnG5.setOnClickListener {
            Toast.makeText(this, "Left gate is stopped !", Toast.LENGTH_SHORT).show()
            myRef.child("Left Gate").setValue("Stopped")
        }

        //Right Gate
        btnG6.setOnClickListener {
            Toast.makeText(this, "Right gate is opening !", Toast.LENGTH_SHORT).show()
            myRef.child("Right Gate").setValue("Opening")
        }

        btnG7.setOnClickListener {
            Toast.makeText(this, "Right gate is stopped !", Toast.LENGTH_SHORT).show()
            myRef.child("Right Gate").setValue("Stopped")
        }

    }
}
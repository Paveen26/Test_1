package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AirConditioner : AppCompatActivity() {

    lateinit var btnAC1: Button
    lateinit var btnAC2: Button
    lateinit var btnAC3: Button
    lateinit var btnACS1: Switch
    lateinit var btnACS2: Switch
    lateinit var btnACS3: Switch
    lateinit var btnACS4: Switch
    lateinit var btnACS5: Switch
    lateinit var btnACS6: Switch
    lateinit var edtR1: EditText
    lateinit var edtR2: EditText
    lateinit var edtLR: EditText
    lateinit var myRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air_conditioner)

        btnAC1 = findViewById(R.id.btnAC1)
        btnAC2 = findViewById(R.id.btnAC2)
        btnAC3 = findViewById(R.id.btnAC3)
        btnACS1 = findViewById(R.id.btnACS1)
        btnACS2 = findViewById(R.id.btnACS2)
        btnACS3 = findViewById(R.id.btnACS3)
        btnACS4 = findViewById(R.id.btnACS4)
        btnACS5 = findViewById(R.id.btnACS5)
        btnACS6 = findViewById(R.id.btnACS6)
        myRef = FirebaseDatabase.getInstance().reference

        edtLR = findViewById(R.id.edtLR)
        edtR1 = findViewById(R.id.edtR1)
        edtR2 = findViewById(R.id.edtR2)

        val maxTextLength = 2
        edtLR.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))
        edtR1.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))
        edtR2.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))

        edtLR

        btnACS1.setOnClickListener {
            if (btnACS1.isChecked){
                Toast.makeText(this, "Living Room AC Power is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Living Room AC Power").setValue("ON")
            }else {
                Toast.makeText(this, "Living Room AC Power is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Living Room AC Power").setValue("OFF")
            }

        }

        btnACS2.setOnClickListener {
            if (btnACS2.isChecked){
                Toast.makeText(this, "Living Room AC Swing is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Living Room AC Swing").setValue("ON")
            }else {
                Toast.makeText(this, "Living Room AC Swing is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Living Room AC Swing").setValue("OFF")
            }

        }

        btnAC1.setOnClickListener {
            Toast.makeText(this, "Living Room air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
            myRef.child("Living Room AC").child("Temperature \u2103").setValue(edtLR.text.toString())
        }

        btnACS3.setOnClickListener {
            if (btnACS3.isChecked){
                Toast.makeText(this, "Bedroom 1 AC Power is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 1 AC Power").setValue("ON")
            }else {
                Toast.makeText(this, "Bedroom 1 AC Power is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 1 AC Power").setValue("OFF")
            }

        }
        btnACS4.setOnClickListener {
            if (btnACS4.isChecked){
                Toast.makeText(this, "Bedroom 1 AC Swing is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 1 AC Swing").setValue("ON")
            }else {
                Toast.makeText(this, "Bedroom 1 AC Swing is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 1 AC Swing").setValue("OFF")
            }

        }

        btnAC2.setOnClickListener {
            Toast.makeText(this, "Bedroom 1 air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
            myRef.child("Bedroom 1 AC").child("Temperature \u2103").setValue(edtR1.text.toString())
        }

        btnACS5.setOnClickListener {
            if (btnACS5.isChecked){
                Toast.makeText(this, "Bedroom 2 AC Power is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 2 AC Power").setValue("ON")
            }else {
                Toast.makeText(this, "Bedroom 2 AC Power is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 2 AC Power").setValue("OFF")
            }

        }
        btnACS6.setOnClickListener {
            if (btnACS6.isChecked){
                Toast.makeText(this, "Bedroom 2 AC Swing is ON", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 2 AC Swing").setValue("ON")
            }else {
                Toast.makeText(this, "Bedroom 2 AC Swing is OFF", Toast.LENGTH_SHORT).show()
                myRef.child("Bedroom 2 AC Swing").setValue("OFF")
            }

        }

        btnAC3.setOnClickListener {
            Toast.makeText(this, "Bedroom 2 air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
            myRef.child("Bedroom 2 AC").child("Temperature \u2103").setValue(edtR2.text.toString())
        }

    }


}
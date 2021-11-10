package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast

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

        edtLR = findViewById(R.id.edtLR)
        edtR1 = findViewById(R.id.edtR1)
        edtR2 = findViewById(R.id.edtR2)

        val maxTextLength = 2
        edtLR.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))
        edtR1.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))
        edtR2.filters = arrayOf(InputFilter.LengthFilter(maxTextLength))



        btnAC1.setOnClickListener {
            Toast.makeText(this, "Living Room air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
        }

        btnAC2.setOnClickListener {
            Toast.makeText(this, "Bedroom 1 air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
        }

        btnAC3.setOnClickListener {
            Toast.makeText(this, "Bedroom 2 air conditioner temperature is set !", Toast.LENGTH_SHORT).show()
        }

    }


}
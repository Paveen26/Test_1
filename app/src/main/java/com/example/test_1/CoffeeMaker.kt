package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CoffeeMaker : AppCompatActivity() {

    lateinit var btnCM: Button
    lateinit var rdgCMOptions: RadioGroup
    lateinit var rdbCMSmall: RadioButton
    lateinit var rdbCMMedium: RadioButton
    lateinit var rdbCMLarge: RadioButton
    lateinit var rdgTOptions: RadioGroup
    lateinit var rdbCoffee: RadioButton
    lateinit var rdbLatte: RadioButton
    lateinit var rdbMocha: RadioButton
    lateinit var rdbEspresso: RadioButton
    lateinit var rdgPSOptions: RadioGroup
    lateinit var rdbP1: RadioButton
    lateinit var rdbP2: RadioButton
    lateinit var rdbP3: RadioButton
    lateinit var myRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_maker)

        myRef = FirebaseDatabase.getInstance().reference
        btnCM = findViewById(R.id.btnCM)

        rdgCMOptions = findViewById(R.id.rdgCMOptions)
        rdbCMSmall = findViewById(R.id.rdbCMSmall)
        rdbCMMedium = findViewById(R.id.rdbCMMedium)
        rdbCMLarge = findViewById(R.id.rdbCMLarge)

        rdgCMOptions.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rdbCMSmall -> {
                    Toast.makeText(this, "Size: Small", Toast.LENGTH_SHORT).show()
                }

                R.id.rdbCMMedium -> {
                    Toast.makeText(this, "Size: Medium", Toast.LENGTH_SHORT).show()
                }

                R.id.rdbCMLarge -> {
                    Toast.makeText(this, "Size: Large", Toast.LENGTH_SHORT).show()
                }
            }
        }

        rdgTOptions = findViewById(R.id.rdgTOptions)
        rdbCoffee = findViewById(R.id.rdbCoffee)
        rdbLatte = findViewById(R.id.rdbLatte)
        rdbMocha = findViewById(R.id.rdbMocha)
        rdbEspresso = findViewById(R.id.rdbEspresso)

        rdgTOptions.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rdbCoffee -> {
                    Toast.makeText(this, "Coffee", Toast.LENGTH_SHORT).show()
                }
                R.id.rdbLatte -> {
                    Toast.makeText(this, "Latte", Toast.LENGTH_SHORT).show()
                }
                R.id.rdbMocha -> {
                    Toast.makeText(this, "Mocha", Toast.LENGTH_SHORT).show()
                }
                R.id.rdbEspresso -> {
                    Toast.makeText(this, "Espresso", Toast.LENGTH_SHORT).show()
                }
            }
        }

        rdgPSOptions = findViewById(R.id.rdgPSOptions)
        rdbP1 = findViewById(R.id.rdbP1)
        rdbP2 = findViewById(R.id.rdbP2)
        rdbP3 = findViewById(R.id.rdbP3)

        rdgPSOptions.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rdbP1 -> {
                    Toast.makeText(this, "Sugar Level: 25%", Toast.LENGTH_SHORT).show()
                }

                R.id.rdbP2 -> {
                    Toast.makeText(this, "Sugar Level: 50%", Toast.LENGTH_SHORT).show()
                }

                R.id.rdbP3 -> {
                    Toast.makeText(this, "Sugar Level: 100%", Toast.LENGTH_SHORT).show()
                }
                //else ->
            }
        }

        btnCM.setOnClickListener {
            Toast.makeText(this, "Your drink will be ready in 5 minutes", Toast.LENGTH_LONG).show()
            //myRef.child("").setValue()
            finish()
        }

    }
}
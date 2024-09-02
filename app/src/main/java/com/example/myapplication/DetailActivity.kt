package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var nombreET: TextView
    private lateinit var apellidoET: TextView
    private lateinit var edadET: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        nombreET = findViewById(R.id.textViewName)
        apellidoET = findViewById(R.id.textViewSurname)
        edadET = findViewById(R.id.editTextAge)

        val bundle = intent.extras
        nombreET.text = bundle?.getString("name")
        apellidoET.text = bundle?.getString("lastName")
        edadET.text = bundle?.getString("age")

    }
}
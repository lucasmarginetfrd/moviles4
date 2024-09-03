package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nombreEt: EditText
    private lateinit var apellidoEt: EditText
    private lateinit var edadEt: EditText
    private lateinit var buttonBtn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreEt = findViewById(R.id.nombre)
        apellidoEt = findViewById(R.id.apellido)
        edadEt = findViewById(R.id.edad)
        buttonBtn = findViewById(R.id.button)

        buttonBtn.setOnClickListener{

            val nombre = nombreEt.text.toString()
            val apellido = apellidoEt.text.toString()
            val edad = edadEt.text.toString()

            if (nombre.isNotBlank() && apellido.isNotBlank() && edad.isNotBlank()) {
                val user: User = User(nombre, apellido, edad)
                val intent = Intent(this, User::class.java)
                intent.putExtra("name", user.name)
                intent.putExtra("lastName", user.lastName)
                intent.putExtra("age", user.age)
                startActivity(intent)
            }
        }


    }
}
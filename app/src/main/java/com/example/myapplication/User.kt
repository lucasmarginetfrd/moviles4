package com.example.myapplication

data class User(
    val name: String,
    val lastName: String?,
    val age: String
) {
    fun imprimirNombre() {
        println("Nombre: $name" + " apellido: $lastName" + " edad: $age")
    }

}
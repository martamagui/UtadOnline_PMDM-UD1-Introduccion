package com.utad.holamundo.kotlin.Basic

fun main() {
    simpleFunction()
    functionWithParameters("Paquito")
    val amIOld: Boolean = functionReturningAValue() //false
}


// Función simple, el equivalente a las de tipo "void" en Java
fun simpleFunction() {
    println("Hola")
}

// Función con parámetros
fun functionWithParameters(userName: String) {
    println("Hola $userName")
}

// Función que retorna un valor.
fun functionReturningAValue(): Boolean {
    val myAge: Int = 18
    return myAge > 60
}

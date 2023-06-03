package com.utad.holamundo.kotlin.Basic

fun main() {
    // Bucle de tipo for recorriendo posiciones
    for (index in 1..5) { //Recorre del número 1 al 5 incluido
        println(index)
    }
    //For recorriendo una lista
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }
    // While
    var count = -1
    while (count < 5) {
        println("Contador: $count")
        count++
    }
    // Do While
    var count2 = 0
    do {
        println("Contador: $count")
        count2++
    } while (count2 < 5)
    //ForEach
    numbers.forEach { number ->
        println(number)
    }


}
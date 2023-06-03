package com.utad.holamundo.kotlin

fun myArrayExamples() {
    //--- Formas básicas de declara un Array ---
    val animals = arrayOf("Perro", "Gato", "Pez") //Tipo Array<String> inferido
    val pets = arrayOf<String>("Hámster", "Conejo", "Canario")
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val numbers2: Array<Int?> = arrayOfNulls<Int>(3)// [null, null, null ]

    //--- Métodos más importantes de los arrays ---
    val petsAmount: Int = pets.size //Devuelve el tamaño del Array -> 3
    val petsLastIndex: Int = pets.lastIndex //Ultimo índice válido del Array -> 2

    //--- Recoger el valor de una posición del Array ---
    val myPet: String = animals[0] // -> "Perro"
    val yourPet: String = animals.get(2) // -> "Gato"
    
    //--- Actualizar el valor de una posición del Array ---
    animals.set(0, "Loro") // "Perro" pasa a ser "Loro"

    //--- Iterar un Array ---
    // Opción 1 -> Recorrer el array por posiciones.
    // Recorre cada "index" dentro de todos los índices que contiene "pets"
    for (index in pets.indices) {
        println(pets[index])
    }

    // Opción 2 -> Recorrer por elementos accediendo directamente al contenido
    // Recorre cada "pet" dentro de todos los "pets"
    for (pet in pets) {
        println(pet)
    }

    // Opción 3 -> forEach
    pets.forEach { pet ->
        println(pet)
    }
}
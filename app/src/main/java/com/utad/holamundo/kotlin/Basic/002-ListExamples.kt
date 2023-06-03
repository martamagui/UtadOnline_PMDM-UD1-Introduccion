package com.utad.holamundo.kotlin.Basic

fun main() {
    //--- Declaración de una lista NO mutable ---
    val readOnly: List<String> = listOf("Pizza", "Hamburguesa", "Ensalada", "Sushi")
    println("Lista NO mutable, solo de lectura: $readOnly")
    //--- Métodos que puedes usar en ambos tipos de listas ---
    val meal = readOnly.get(2) // Obtiene el valor en la posición 2 -> "Ensalada"
    val mealV2 = readOnly[2] // Obtiene el valor en la posición 2 -> "Ensalada"
    val firstMeal = readOnly.first() // Obtiene el primer valor -> "Pizza"
    val lastMeal = readOnly.last() // Obtiene el último valor -> "Sushi"
    val menuSize = readOnly.size // Tamaño de la lista -> 4
    val containsPizza = readOnly.contains("Pizza") // Verifica si contiene "Pizza" -> true

    println("Meal= $meal, mealV2= $mealV2, firstMeal= $firstMeal, lastMeal= $lastMeal")
    println("El tamaño de mi menú es $menuSize, pero... ¿Tiene pizza? $containsPizza\n\n")

    //--- Declaración de una lista MUTABLE, se puede editar ---
    var mutableList: MutableList<String> = mutableListOf("Tacos", "Pasta", "Sopa")
    println("Mi lista MUTABLE al principio: $mutableList")
    mutableList.add("Postre") // Agrega "Postre" -> [Tacos, Pasta, Sopa, Postre]
    println("Añado un poste: $mutableList")

    mutableList.set(0, "Pescadito frito") // Cambia el valor en la posición 0
    mutableList[2] = "Patatas" // Cambia el valor en la posición 2
    mutableList.add("Pescadito frito") // Añado más pescadito frito al final
    println("Cambio tacos por pescadito frito y añado otro extra: $mutableList")

    mutableList.remove("Pescadito frito") //Elimina la 1ª aparición del elemento en lista
    println("Quito el 1er pescadito frito: $mutableList")

    // Agrega múltiples elementos a la lista
    mutableList.addAll(listOf("Tacos", "Tacos", "Tacos"))
    println("Añado muchos tacos: $mutableList")

    // Elimina todas las apariciones de los elementos indicados en la lista -> [Sopa, Postre]
    mutableList.removeAll(listOf("Tacos", "Pasta"))
    println("Borro todos los tacos y pasta de la carta: $mutableList")

    //--- ITERACIÓN ---
    val menu: List<String> = listOf("Pizza", "Hamburguesa", "Ensalada", "Sushi")
    // Opción 1 y 2 igual que en los Arrays
    for (index in menu.indices) {
        println("Plato: ${menu.get(index)}")
    }
    for (meal in menu) {
        println(meal)
    }
    // Opción 3, cada iteración saca tanto el índice cómo el valor de la lista menu
    for ((index, meal) in menu.withIndex()) {
        println("Índice del menú: $index, Comida: $meal")
    }
    // Opción 4-> ForEach, recorre cada elemento de la lista
    menu.forEach { meal ->
        println(meal)
    }

    //Otras funciones de iteración:

    val menuInCapitalLetters: List<String> = menu.map { meal -> meal.toUpperCase() }
    /* map, crea una nueva lista a partir de los valores de la que lee ->
     	[PIZZA, HAMBURGUESA, ENSALADA, SUSHI] */

    val menuFiltered: List<String> = menu.filter { comida -> comida.startsWith("P") }
    /* filter, filtra los elementos según una condición especificada en
     una función lambda -> [Pizza] */
}
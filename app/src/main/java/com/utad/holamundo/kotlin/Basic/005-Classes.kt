package com.utad.holamundo.kotlin.Basic

//Declaración de la clase Student, con la propiedad "name" y la función "study"

class Teacher {
    val subject : String = "PMDM"
    fun solveQuestions(){
        println("¿Alguna pregunta?")
    }
}

class Student(val name: String) {
    val classroom: String = "DAM"

    fun study() {
        println("Soy $name de $classroom. Estoy estudiando.")
    }

}

fun main() {
    // Podemos crear una instancia así
    val damStudent: Student = Student("Irene")
    val teacher: Teacher = Teacher()

    // y acceder a sus propiedades siempre y cuando sean accesibles
    val studentClassroom: String = damStudent.classroom //-> Dam

    // También podemos llamar a sus funciones si son accesibles, como en este caso.
    damStudent.study() //imprimirá -> "Soy Irene de DAM. Estoy estudiando"
    teacher.solveQuestions() //imprimirá -> "¿Alguna pregunta?"
}

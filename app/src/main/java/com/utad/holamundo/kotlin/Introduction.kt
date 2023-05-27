package com.utad.holamundo.kotlin

import android.util.Log

fun ejemploDeclaracionVariables(){

    /*Esta variable al estar declarada con la palabra
    reservada "val" NO podrá alterar su valor */
    val userName = "@Iv_dev"

    /* Por el contrario con "var" podemos alterar el valor de
    nuestras variables siempre que lo necesitemos */
    var userDerscription = "Soy Iván, estoy aprendiendo a programar 🤓"
    userDerscription = "Llámame Ivan, tu senior-dev de confianza 😎"
}

fun ejemploTipadosExplicitos() {

    /* No obstante, van a darse otras situaciones en las que sí necesitemos
        indicar el tipo de una variable. */
    val myString: String = "Esto es un texto"
    val myChar:Char = 'a'// Los valores Char se recogen entre comillas simples
    val myBoolean: Boolean = false

    //--- Números ---
    //Los números podemos dividirlos en dos categorías

    //--- Enteros ---
    val myInt:Int = 1
    val myLong1 : Long = 30000000000
    val myLong2: Long = 1L // Long. Si no se pone el tipo se pueed poner una L al final para indicar el tipo
    val myByte: Byte = 1

    //--- De coma flotante ---
    val myDouble: Double = 5.55
    val myFloat: Float = 3.1416f // Es necesario poner una 'f' al final
}

fun ejemploTipadosInferidos(){

    //--- Tipado inferido ---
    /*
    En Kotlin no es necesario siempre declarar de qué tipo es una variable.
        Al declarar una variable sin indicar el tipo. Durante la compilación
        asumirá el tipo de esta en base al valor asignado.
     */
    val myInferredType1 = "Hola" // String
    val myInferredType2 = 1 // Int
    val myInferredType3 = false // Boolean
    val myInferredType4 = 1L // Long, se pone una L al final para indicar que es un Long
    val myInferredType5 = 1.1 // Double
    val myInferredType6 = 3.14f // Float

}

fun ejemplosDeOperadores() {

    //--- Operadoes de signo ---
    val negativeNumber = -5 // Número negativo

    //--- Operadoes aritméticos ---
    val suma = 2 + 1 //Devuelve 4
    val resta = 2 - 1 // Devuelve 1
    val multiplicacion = 2 * 2 // Devuelve 4
    val divisionSinDecimales =
        10 / 3 //Devuelve 3. Al dividir dos nºs enteros salen nºs redondos
    val divisionConDecimales = 2.0 / 3
    val restoDivision = 10 % 3 // Devuelve 1, ya que es el resto de 10/3


    //--- Operadoes de incremento y decremento ---
    var miNumeroBase = 1
    miNumeroBase++ // miNumeroBase = miNumeroBase + 1
    miNumeroBase-- // miNumeroBase = miNumeroBase - 1

    //--- Operadoes de asignación compuesta ---
    /*  Este tipo de operadores realizan la operación aritmética sobre el valor
        previo de la variable. El primer ejemplo equivaldría a:
            miNumero = miNumero + 2
    */
    var miNumero = 1
    miNumero += 2 // miNumero =  miNumero + 2 . Resultado: 3
    miNumero -= 1 // miNumero =  miNumero - 1 . Resultado: 2
    miNumero *= 3 // miNumero =  miNumero * 3 . Resultado: 6
    miNumero /= 3 // miNumero =  miNumero / 3 . Resultado: 2
    miNumero %= 2 // miNumero =  miNumero % 2 . Resultado: 0

    Log.d("Mi ejemplo", divisionConDecimales.toString())
}

fun ejemplosDeOperadoresLogicos() {

    //--- Operadoes relacionales ---
    val numA = 5
    val numB = 7

    val sonIguales = numA == numB // false
    val sonDistintos = numA != numB // true

    val esNumeroAMenorQueB = numA < numB // true
    val esNumeroAMayorQueB = numA > numB // false

    val esNumeroAMenorOIgualQueB = numA <= numB // true
    val esNumeroAMayorOIgualQueB = numA >= numB // false

    //--- Operadoes lógicos ---
    val myNum = 9
    val ejemploAnd = myNum > 5 && myNum < 20 // true. Compara que dos condiciones sean iguales
    val ejemploOr = myNum > 5 || myNum < 1 // true. Compara que una de las dos condiciones sea verdadera
    val ejemploNegacion = !(true) // false. Invierte el valor de la condición.
}

fun ejemploDeConcatenacion() {
    val myName = "Alicia"
    val greeting = "Hola, me llamo $myName" // Hola, me llamo Alicia
}
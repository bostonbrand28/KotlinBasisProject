package edu.unicatolica.kotlin

fun main() {

    println("Ingrese la primera nota: ")
    val nota1 = readLine()!!.toDouble()

    println("Ingrese la segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    println("Ingrese la tercera nota: ")
    val nota3 = readLine()!!.toDouble()


    if (nota1 >= 0 && nota1 <= 5 &&
        nota2 >= 0 && nota2 <= 5 &&
        nota3 >= 0 && nota3 <= 5) {


        val promedio = (nota1 + nota2 + nota3) / 3


        println("El promedio es: $promedio")
    } else {
        println("Error: las notas deben estar entre 0 y 5")
    }
}

package edu.unicatolica.kotlin

fun main() {

    val numeros = listOf(1, 2, 4, 7, 13, 9, 23)


    val resultado = numeros.map { esnumeroPrimo(it) }

    println("IN: $numeros")
    println("OUT: $resultado")
}


fun esnumeroPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}
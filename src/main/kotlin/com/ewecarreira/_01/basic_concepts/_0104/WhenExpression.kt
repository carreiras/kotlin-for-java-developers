package com.ewecarreira._01.basic_concepts._0104

fun main() {

    // No Kotlin, a Expressão When substitui o Switch, e apresenta duas formas:

    // 1. Com argumentos
    val pizzasOrdered = 2

    when (pizzasOrdered) {
        0 -> {  // utilize {} para mais ações para o argumento
            println("Not hungry")
            println("Thanks")
        }
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        0 -> {
            println("Not hungry")
            println("Thanks")
        }
        1, 2 -> println("Hungry")   // é possível combinar argumentos
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    /*
    A expressão When não está limitada a simplesmente comparar com constantes (como em Switch).
    Também é possível comparar o argumento com o resultado de uma expressão
    */
    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered or more pizzas")
        else -> println("Ordered less than 0")
    }

    // Também é possível comparar o argumento com ranges
    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    // 2. Sem argumentos

    /*
    Neste caso, o When é um substituto do if... if else... else
    Temos a funcionalidade do if else, de forma mais compacta
     */

    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }
}
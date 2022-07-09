package com.ewecarreira._01.basic_concepts._0104

fun main() {

    // No Kotlin, a Expressão When substitui o Switch, e apresenta duas formas:

    // 1. Com argumento
    val pizzaOrdered = 2

    when (pizzaOrdered) {
        0 -> {  // utilize {} para mais ações para o argumento
            println("Not hungry")
            println("Thanks")
        }
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzaOrdered) {
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
    when (pizzaOrdered) {
        Math.abs(pizzaOrdered) -> println("Ordered or more pizzas")
        else -> println("Ordered less than 0")
    }

    // Também é possível comparar o argumento com ranges
    when (pizzaOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Are you sure?")
    }
}
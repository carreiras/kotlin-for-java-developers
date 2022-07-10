package com.ewecarreira._01.conceitos_basicos._0106

fun main() {
    // Iterando com um range e capturando o índice
    println()

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} -> $item")
    }

    // Iterando com um range e capturando o índice sem a necessidade de criar uma variável
    println()

    for ((ind, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${ind + 1} -> $item")
    }

    // Iterando com um array
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)

    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
}
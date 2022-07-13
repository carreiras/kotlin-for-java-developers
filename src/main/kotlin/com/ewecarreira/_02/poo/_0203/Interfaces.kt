package com.ewecarreira._02.poo._0203

/*
Interfaces em Kotlin, são semelhantes à Java.
Ambas contem declarações para implementações de métodos que também são semelhantes às classes abstratas,
mas, diferentemente das clases abstratas, as interfaces não podem armazenar o estado.
 */

fun main() {

    val myCar = Car()

    myCar.start()

    println("My Car´s make = ${myCar.autoMakerName}" )
}
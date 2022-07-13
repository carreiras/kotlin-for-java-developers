package com.ewecarreira._02.poo._0202

/*
A criação de objetos no Kotlin, tem grandes diferenças em relação ao Java.
Pode-se criar objetos dentro de uma função, ou separadamente no mesmo arquivo, e o mesmo objeto
também pode ser criado separamente em outro arquivo.

Para criar um objeto, utiliza-se a função **object**

IMPORTANTE:
Em Kotlin, não é necessário criar uma classe para criar um objeto.
Os objetos são entidades por si mesmo.
*/

fun main() {

    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    // Objetos podem ter, inclusive, métodos (ou funções)

    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")

        }
    }

    location2.printIt()

    /*
    Os atributos dos objetos são como qualquer outra variavel,
    caso os atributos estejam setados como "var", eles podem ser alterados.
     */
    location2.xCoordinate = 3000
    location2.yCoordinate = 6000
    location2.printIt()

    /**
    Há também a Object Declarations, que ao contrário do Object Type (visto acima), é uma instrução, e não uma expressão.
     */
    val temperature = MySigleton.getLastTemprature()
    println("Last temperature measured: $temperature degress")
}

object MySigleton {
    var temperatures = arrayOf(18, 22, 26)

    fun getLastTemprature() = temperatures.last()
}
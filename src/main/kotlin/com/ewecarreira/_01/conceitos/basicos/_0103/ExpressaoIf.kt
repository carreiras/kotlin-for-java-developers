package com.ewecarreira._01.conceitos.basicos._0103

fun main() {

    /*
    Em Kotlin, IF é uma expressão e não uma instrução;
    É a maneira mais básica de controlar um fluxo em Kotlin;
    O valor de retorno é o valor da última expressão;
    Declaração ternária é desnecessária;


    Ao utilizar o if como expressão, é obrigatória a clausula "else"
    */

    val myInt = 199
    val aInt: Int = 7
    val lowest = if (myInt < aInt) myInt else aInt

    // Outro Exemplo

    val temp = 26
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warn")
        true
    } else {
        println("It is not so warn")
        false
    }

//    Para contatenar variáveis no Kotlin, basta informar a variavel precedida de $

    println("Is the air conditioner on: $isAirConditionerOn")

    /********************************************
    IMPORTANTE:

    O If também pode ser utilizado da forma convencional, ou seja, como uma estrutura de decisão
     */
}
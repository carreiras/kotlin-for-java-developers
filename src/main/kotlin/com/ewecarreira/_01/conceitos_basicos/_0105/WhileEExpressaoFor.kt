package com.ewecarreira._01.conceitos_basicos._0105

fun main() {
    // 1. While / Do While

    // While e Do While, se comportam exatamente como no Java
    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    /*
    2. For

    Um loop for clássico contém:
    1 - Inicializador do loop
    2 - Verificador do loop
    3 - Iterador do loop
    4 - Instruções do loop

    for(int i-0; i<10; i++) {// Instruções do loop}

    A instrução for do Kotlin, funciona com qualquer interador, não existindo, portanto, o forEach
     */

    for (item in 1..10) {
        print("$item, ")
    }

    for (ch in "Iterating over Strings") {
        print(ch)
    }

    /*
    Os pontos chaves do for, no Kotlin, são:
    - O valor da iteração: item;
    - O iterador: 1 .. 10 e
    - O corpo do for

    IMPORTANTE: a variavel $item no for é um tipo de valor imutável, ou seja, internamente é um val.
    Portanto, ao tentar modificá-lo (por exemplo, com item++), o compilador irá reportar um erro
     */
}
package com.ewecarreira._01.conceitos.basicos._0107

/*
Declarar funções em Kotlin é muito semelhante à declaracao de variaveis,
porém, ao invés de utilizar "val" ou "var", a palavra chave no caso é "fun",
seguida de: nome da função, parametros, e o tipo de retorno
 */

/*
A assinatura do um método, em Java, seria escrito da seguinte forma:
public Integer myMathFunction(Integer number1, Integer number2) {// conteudo}

A assinatura da mesma função/método em Kotlin:
fun myMathFunction(number1: Int, number2: Int): Int {// conteudo}

Onde:
fun -> palavra chave para a criação da função
myMathFunction -> nome da função/método
(number1: Int, number2: Int) -> parametros da função/método
: Int -> retorno da função/método

Observe a sintaxe mais enxuta e menos verbosa do Kotlin
 */

fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

/*
Quando uma função tem apenas uma linha, a mesma pode ser simplificada com Expression Body, como a seguir:
 */

fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

/*
E pode ser simplificado ainda mais, utilizando a inferência de dados.
Uma vez que os dois parametros são do tipo Int, o Kotlin irá inferir o retorno da função
 */
fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

/*
Também é possível configurar valores-padrão para os parâmetros.
Isto evita bastante o uso de sobrecarga de métodos que utilizamos em Java
 */
fun myFunctionWithDefault(number1: Int = 1, number2: Int = 5, message: String = "Hi"): Int {
    val result = number1 + number2
    println(message)
    return result
}

/*
Utilizando a função main para executar os métodos declarados:
 */
fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")
    println("25 + 35 = ${myExpressionBodyFunctionWithInference(25, 35)}")
    println("25 + 35 = ${myFunctionWithDefault(25, 35)}")
    println("25 + 35 = ${myFunctionWithDefault(25, 35, "Hello")}")
    println("25 + 35 = ${myFunctionWithDefault(25, 35, "Hello")}")

    // sem nenhum argumento
    println("Default sum without any parameter = ${myFunctionWithDefault()}")

    // utilizando argumento nomeado
    println("Default sum informing only one of the parameters = ${myFunctionWithDefault(message = "Hello")}")
}
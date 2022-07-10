package com.ewecarreira._01.conceitos.basicos._0101

fun main() {

    // Klotin consegue criar variáveis por inferência, bastando para isso, informar o conteúdo da mesma.
    val myPhraser = "I'm a Stringg"
    val myPI = 3.14
    val myAnswer = 47
    val myDouble = 1.999
    val myInt = 199

    // Caso a variável não tenha o conteudo informado, deve-se informar o tipo.
    val aString: String
    val aDouble: Double
    val aInt: Int

    // Para tipos Float, deve-se informar "F" ou "f" ao final. Caso contrário, o Kotlin fará cast para Double.
    val myFloat = 1.99F

    // Para tipos Long, deve-se informar "L" ao final. Caso contrário, o Kotlin fará cast para Int.
    val myLong = 9977989623232L

    // Tipos Short devem ser explicamente informados.
    val myShort: Short = 12

    // Tipos Byte devem ser explicamente informados.
    val myByte: Byte = -128

    // Pode ser utilizado "_" para tornar variáveis numéricas mais legiveis.
    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    // O Kotlin, diferente do Java, exige que as conversões sejam explicitas!!! (mesmo que esta conversão
    // seja para um tipo maior) Para isso, o Kotlin fornece um conjunto de conversores.
    val anInt: Int = 7
    val aLong: Long = anInt.toLong()
}
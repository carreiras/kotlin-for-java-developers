package com.ewecarreira._02.poo._0204

/*
Sabemos que Generic em Java, é uma maneira de criar uma classe ou um método que pode
funcionar com diferentes tipos de dados similares.

Generics em Kotlin são semelhantes aos de Java porém, mais fáceis de trabalhar
 */
fun main() {

    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123_456_789L, 999_999_999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alpha", "Omega")

    println("The max Int: $maxInt")
    println("The max Long: $maxLong")
    println("The max Byte: $maxByte")
    println("The max String: $maxString")

}
/*
A declaração de pacotes em Kotlin é opcional, porém, se for declarada, deve ser feita na primeira linha do arquivo
 */
fun main() {
    println("Declaring packages in Kotlin is optional, however, if declared, it must be done on the first line of the file")
}

/*
Caso o código tenha a necessidade de ser interoperável como Java, é necessário a utilização da declaração dos pacotes

Para importações de pacotes, o Kotlin já importa automaticamente:

- kotlin.*
- kotlin.annotation.*
- kotlin.collections.*
- kotlin.comparisions.*
- kotlin.io.*
- kotlin.ranges.*
- kotlin.sequences.*
- kotlin.text.*
- kotlin.lang.*
- kotlin.jvm.*
*/
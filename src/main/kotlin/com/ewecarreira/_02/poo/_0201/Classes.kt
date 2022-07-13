package com.ewecarreira._02.poo._0201

/* -----------------------------------------------------------------|
| No Kotlin, diferentemente do Java, podemos definir mais de uma    |
| classe por arquivo (isso sem ser innerclass).                     |
|                                                                   |
| Por padrão, as classes são públicas, o que é o oposto do Java.    |
| Uma classe pode ter um construtor primário e vários construtores  |
| secundários.                                                      |
|                                                                   |
| Para criar um construtor primário utiliza-se a palavara-chave     |
| "constructor", porém, esta palavra também pode ser omitida,       |
| simplificando assim a sintaxe.                                    |
|                                                                   |
| A palavra-chave "constructor" só é realmente necessária, se o     |
| construtor tiver uma notação, ou um modificador de visibilidade. E|
| dentro do construtor primário não pode haver nenhuma implementação|
| ou código, porém, caso seja necessário efetuar algo assim que a   |
| classe for inicializada, utiliza-se a palavra-chave "init".       |
|                                                                   |
|----------------------------------------------------------------- */

/* -----------------------------------------------------------------|
| IMPORTANTE                                                        |
|  - Em Kotlin, a palavra-chave "new", não é necessária.            |
|  - E "enums", é apenas uma palavra-chave, que só tem significado  |
|    quando é seguida pela palavra chave "class".                   |
|----------------------------------------------------------------- */

fun main() {
    // acesse o arquivo Person.kt para melhor entendimento
    var person1 = Person1("Moon", "Knight")
    var person2 = Person2("Mark", "Spector")
}
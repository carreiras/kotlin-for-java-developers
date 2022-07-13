package com.ewecarreira._02.poo._0201

/* -----------------------------------------------------------------|
| Exemplo sem a palavra-chave "constructor"                         |
------------------------------------------------------------------ */
class Person1(firstName: String, lastName: String) {

    init {
        println("Create a person1 named $firstName $lastName")
    }
}

/* -----------------------------------------------------------------|
| Exemplo com a palavra-chave "constructor", devido a altaração da  |
| visilibidade.                                                     |
|                                                                   |
| Este exemplo também possui um construtor secundário.              |
|                                                                   |
| Construtores secundários, são utilizados, assim como em Java, para|
| instânciar a classe com atributos diferentes do construtor        |
| primário.                                                         |
|                                                                   |
| Para utilizar construtores secundário, os mesmos devem referenciar|
| o construtor primario através da palavra-chave this               |
------------------------------------------------------------------ */
class Person2 internal constructor(firstName: String, lastName: String) {

    init {
        println("Create a person2 named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName)
}


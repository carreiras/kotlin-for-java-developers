package com.ewecarreira._02.poo._0203

/* -----------------------------------------------------------------|
| Não é necessário o uso da palavra-chave "implements", bastando    |
| apenas utilizar ":" e o nome da interface.                        |
|                                                                   |
| Também, diferente do Java, "override" é uma palavra-chave, e não  |
| uma annotation.                                                   |
|----------------------------------------------------------------- */

class Car() : Vehicle {

    override val autoMakerName = "Honda"

    override fun getDoors() = 5
}
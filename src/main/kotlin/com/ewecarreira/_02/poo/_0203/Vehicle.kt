package com.ewecarreira._02.poo._0203

/*
O kotlin permite criar funções na interface que vão funcionar de forma similar à herança.

IMPORTANTE:
Os métodos start, stop e getKmPerLiter, serão herdados, pois na interface, eles contém um corpo.
Já o método getDoors, precisará ser sobrescrito.
 */
interface Vehicle {

    val autoMakerName: String

    fun start() {
        println("Vruuuuuuummmmmmmmmmmmmmm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}
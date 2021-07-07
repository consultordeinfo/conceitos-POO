package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    //foreach dentro da classe ClienteTipo usando Enum
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println("Da classe Enum ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("Da classe Enum ${pj.name} - ${pj.descricao}")
}
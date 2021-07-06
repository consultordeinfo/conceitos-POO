package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    //Estanciando Banco e passando os parametros de banco
    val digiOneBank = Banco (nome = "DigiOne", numero = 12)

    //Printando as informações
    println("Banco: " + digiOneBank.nome)
    println("Agencia: " + digiOneBank.numero)
}
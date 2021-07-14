package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val fabio = Gerente ( "Fabio Henrique", "1234567899", 3000.0, "senha123")
    imprimeRelatorioFuncionario.imprimir(fabio)

    TesteAutenticacao().autentica(fabio)
}
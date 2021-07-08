package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {

    //Metodo estatico para envocação sem instancia
    companion object {
        fun imprimir (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}
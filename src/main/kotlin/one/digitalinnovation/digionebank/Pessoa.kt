package one.digitalinnovation.digionebank

class Pessoa {
    //Atributos da classe Pessoa
    var nome: String = "Helio"
    var sobrenome: String = "Santos de Alencar"
    var cpf: String = "282.231.738.08"
    //private set //Mantendo o SET privado, impeço que receba qualquer valor!

    //Criando uma classe interna
    /*inner class Endereco {
        var rua: String = "Rua da Fortuna"
    }*/

    //Criando um construtor
    constructor() //Tipo de construtor SECUNDÁRIO

    fun pessoaInfo() = "Seu nome é $nome $sobrenome, inscrito no CPF número: $cpf"
}

fun main() {
    //Estanciando um OBJETO
    val helio = Pessoa()

    //Saida para a classe Pessoa
    /*println("Nome: " + helio.nome)
    println("Sobrenome: "+ helio.sobrenome)
    println("CPF: " + helio.cpf)*/

    //Saida para a classe Endereco dentro da classe Pessoa
    //println("Endereço: " + helio.Endereco().rua)

    //Chamando toda a função pessoaInfo
    println(helio.pessoaInfo())
}
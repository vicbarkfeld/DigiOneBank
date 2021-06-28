package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Victoria"

    var cpf: String = "123.456.678-89"
    private set

  constructor()

  fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val victoria = Pessoa()
    println(victoria.pessoaInfo())
}
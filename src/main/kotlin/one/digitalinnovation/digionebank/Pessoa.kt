package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Victoria"

    var cpf: String = "123.456.678-89"
    private set
}

fun main() {
    val victoria = Pessoa()

    println(victoria.nome)
    println(victoria.cpf)
}
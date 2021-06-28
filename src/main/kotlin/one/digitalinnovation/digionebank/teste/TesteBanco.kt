package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "digiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}
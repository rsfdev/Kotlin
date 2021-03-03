package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Roger = Gerente("Roger S", "1234567899", 5000.0, "senha1234")

    ImprimeRelatorioFuncionario.imprime(Roger)

    TesteAutenticacao().autentica(Roger)
}
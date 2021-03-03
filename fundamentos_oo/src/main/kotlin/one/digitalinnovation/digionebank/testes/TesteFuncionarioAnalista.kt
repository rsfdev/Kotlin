package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val Roger = Analista("Roger F", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(Roger)
}

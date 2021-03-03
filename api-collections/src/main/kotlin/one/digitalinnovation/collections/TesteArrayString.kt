package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "John"
    nomes[1] = "Leonel"
    nomes[2] = "Kennedy"

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Mary", "Zeck", "Peter")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
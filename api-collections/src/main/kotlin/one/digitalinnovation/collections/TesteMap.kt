package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("John", 2500.0)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) -> println("Chave: $t - Valor $u") }

    val map2 = mapOf(
        "Peter" to 1350.0,
        "Mary" to 2550.0
    )

    map2.forEach { (t, u) -> println("Chave: $t - Valor $u") }
}
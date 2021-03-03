package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.00, 2300.0, 4500.00)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("------------------------------")
    val salariosMaiorQue2299 = salarios.filter { it > 2299.0 }
    salariosMaiorQue2299.forEach { println(it) }

    println("------------------------------")
    println(salarios.count { it in 2200.0..5000.0 })

    println("------------------------------")
    println(salarios.find { it == 4500.0 })

    println("------------------------------")
    println(salarios.any { it == 4000.0 })
}
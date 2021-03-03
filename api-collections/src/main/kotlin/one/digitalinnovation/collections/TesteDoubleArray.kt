package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 900.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0, 1200.0, 7000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}
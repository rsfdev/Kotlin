package one.digitalinnovation.collections

fun main() {
    val john = Funcionario("John", 3000.0, "CLT")
    val peter = Funcionario("Peter", 1200.0, "PJ")
    val josephine = Funcionario("Josephine", 7000.0, "CLT")

    val funcionarios = listOf(john, peter, josephine)

    funcionarios.forEach { println(it) }

    println("---------------------------------------------")
    println(funcionarios.find { it.nome == "Peter" })

    println("---------------------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}
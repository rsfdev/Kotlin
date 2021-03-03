package one.digitalinnovation.collections

fun main() {
    val john = Funcionario("John", 3000.0, "CLT")
    val peter = Funcionario("Peter", 1200.0, "PJ")
    val josephine = Funcionario("Josephine", 7000.0, "CLT")

    println("-------------------LIST----------------------")
    val funcionarios = mutableListOf(john, josephine)
    funcionarios.forEach { println(it) }

    println("-----------------------------------------")
    funcionarios.add(peter)
    funcionarios.forEach { println(it) }

    println("-----------------------------------------")
    funcionarios.remove(john)
    funcionarios.forEach { println(it) }

    println("-------------------SET----------------------")
    val funcionarioSet = mutableSetOf(john)
    funcionarioSet.forEach { println(it) }

    println("-----------------------------------------")
    funcionarioSet.add(peter)
    funcionarioSet.add(josephine)
    funcionarioSet.forEach { println(it) }

    println("-----------------------------------------")
    funcionarioSet.remove(josephine)
    funcionarioSet.forEach { println(it) }



}
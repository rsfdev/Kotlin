package one.digitalinnovation.collections

fun main() {
    val john = Funcionario("John", 3000.0, "CLT")
    val peter = Funcionario("Peter", 1200.0, "PJ")
    val josephine = Funcionario("Josephine", 7000.0, "CLT")

    val funcionarios1 = setOf(john, josephine)
    val funcionarios2 = setOf(peter)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("------------------------------")
    val funcionarios3 = setOf(john, josephine, peter)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}
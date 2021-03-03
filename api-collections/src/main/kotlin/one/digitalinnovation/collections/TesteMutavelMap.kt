package one.digitalinnovation.collections

fun main() {
    val john = Funcionario("John", 3000.0, "CLT")
    val peter = Funcionario("Peter", 1200.0, "PJ")
    val josephine = Funcionario("Josephine", 7000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(john.nome, john)
    repositorio.create(peter.nome, peter)
    repositorio.create(josephine.nome, josephine)

    println(repositorio.findById(josephine.nome))

    println("---------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------------------------------")
    repositorio.map.values.forEach { println(it) }

    println("---------------------------------")
    repositorio.remove(peter.nome)
    repositorio.findAll().forEach { println(it) }
}
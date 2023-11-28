package entidades

class Besouro(nome: String, idade: Long) : Bugs(nome, idade,) {
    override fun come() {
        println("hora do rango, aqui é bodybuilder")
    }

    override fun reproduz() {
        println("Besouro:: Com segurança ok?!")
    }
}

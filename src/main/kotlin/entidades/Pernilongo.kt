package entidades

class Pernilongo(nome: String, idade: Long) : Bugs(nome, idade,) {
    override fun come() {
        println("vou ali pertubar")
    }

    override fun reproduz() {
        println("Pernilongo:: Com segurança ok?!")
    }
}

package entidades

class Joaninha(nome: String, idade: Long) : Bugs(nome, idade,) {
    override fun come() {
        println("eu vim pra essa vida é pra comerrrrrrrrr")
    }

    override fun reproduz() {
        println("Joaninha:: Com segurança ok?!")
    }
}

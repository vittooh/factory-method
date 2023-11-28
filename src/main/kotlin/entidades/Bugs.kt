package entidades

abstract class Bugs(
    var nome: String,
    var idade : Long
) {
    abstract fun come()
    abstract fun reproduz()
}

package afterrefactor

import beforerefactor.Operacoes
import entidades.BugsTipos
import entidades.Joaninha

class JoaninhaServiceRefactored : Operacoes {
    override fun armazena() {
        val joaninha =  FabricaDeBugs.criaBugsFactory(BugsTipos.JOANINHA)
        println("Armazenando")
    }

    override fun alimenta() {
        val joaninha =  FabricaDeBugs.criaBugsFactory(BugsTipos.JOANINHA)
        joaninha.come()
    }

    override fun reproduz() {
        val joaninha =  FabricaDeBugs.criaBugsFactory(BugsTipos.JOANINHA)
        joaninha.reproduz()
    }
}

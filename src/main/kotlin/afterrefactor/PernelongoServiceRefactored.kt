package afterrefactor

import beforerefactor.Operacoes
import entidades.BugsTipos
import entidades.Joaninha
import entidades.Pernilongo

class PernelongoServiceRefactored : Operacoes {
    override fun armazena() {
        val pernilongo = FabricaDeBugs.criaBugsFactory(BugsTipos.PERNILONGO)
        println("armazenando ")
    }

    override fun alimenta() {
        val pernilongo = FabricaDeBugs.criaBugsFactory(BugsTipos.PERNILONGO)
        pernilongo.come()
    }

    override fun reproduz() {
        val pernilongo = FabricaDeBugs.criaBugsFactory(BugsTipos.PERNILONGO)
        pernilongo.reproduz()
    }
}

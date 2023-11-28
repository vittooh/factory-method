package afterrefactor

import beforerefactor.Operacoes
import entidades.BugsTipos

class BesouroServiceRefactored : Operacoes {
    override fun armazena() {
        val besouro = FabricaDeBugs.criaBugsFactory(BugsTipos.BESOURO)
        println("Armazenando")
    }

    override fun alimenta() {
        val besouro =  FabricaDeBugs.criaBugsFactory(BugsTipos.BESOURO)
        besouro.come()
    }

    override fun reproduz() {
        val besouro =  FabricaDeBugs.criaBugsFactory(BugsTipos.BESOURO)
        besouro.reproduz()
    }
}

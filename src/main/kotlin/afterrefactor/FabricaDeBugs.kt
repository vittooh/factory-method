package afterrefactor

import entidades.*
import kotlin.random.Random

class FabricaDeBugs {

    companion object {
        fun criaBugsFactory(bugsTipos: BugsTipos) : Bugs {
            return when (bugsTipos) {
                BugsTipos.JOANINHA -> Joaninha("joaninha", Random.nextLong())
                BugsTipos.BESOURO -> Besouro("besourinho",Random.nextLong())
                BugsTipos.PERNILONGO -> Pernilongo("sou chato",Random.nextLong())
            }
        }
    }

}
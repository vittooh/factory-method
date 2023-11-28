import afterrefactor.BesouroServiceRefactored
import afterrefactor.JoaninhaServiceRefactored
import afterrefactor.PernelongoServiceRefactored

fun main(args: Array<String>) {

    val besouroServiceRefactored = BesouroServiceRefactored()
    val joaninhaServiceRefactored = JoaninhaServiceRefactored()
    val pernelongoServiceRefactored = PernelongoServiceRefactored()

    besouroServiceRefactored.alimenta()
    besouroServiceRefactored.reproduz()
    besouroServiceRefactored.armazena()

    joaninhaServiceRefactored.alimenta()
    joaninhaServiceRefactored.reproduz()
    joaninhaServiceRefactored.armazena()

    pernelongoServiceRefactored.alimenta()
    pernelongoServiceRefactored.reproduz()
    pernelongoServiceRefactored.armazena()
}
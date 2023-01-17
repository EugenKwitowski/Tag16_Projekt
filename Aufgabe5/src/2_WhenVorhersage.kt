/*
    Schreibe hier deine Lösung für die Aufgabe hin:
    Nationalität: Japanisch
    Nationalität nicht in Datenbank
 */

fun main() {
    val nationality: String = "japanese"

    when (nationality) {
        "german" -> println("Nationalität: Deutsch")
        "italian" -> println("Nationalität: Italienisch")
        "japanese" -> println("Nationalität: Japanisch")
        "namibian" -> println("Nationalität: Namibisch")
        "brazilian" -> println("Nationalität: Brasilianisch")
        else -> println("Nationalität nicht in Datenbank")
    }
}
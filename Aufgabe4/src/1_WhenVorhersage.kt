/*
    Schreibe hier deine Lösung für die Aufgabe hin:
    a Kind ist in Gruppe B
      Kind ist in Gruppe D
      Für dieses Geburtsjahr gibt es keine Gruppe
 */

fun main() {
    val birthyear: Int = 2011

    when (birthyear) {
        2010 -> println("Kind ist in Gruppe A")
        2011 -> println("Kind ist in Gruppe B")
        2012 -> println("Kind ist in Gruppe C")
        2013 -> println("Kind ist in Gruppe D")
        2014 -> println("Kind ist in Gruppe E")
        else -> println("Für dieses Geburtsjahr gibt es keine Gruppe")
    }
}
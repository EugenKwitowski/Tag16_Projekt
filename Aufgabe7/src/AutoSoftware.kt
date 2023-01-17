fun main() {
    val isMotorRunning = true
    val doorsAreClosed = false

    if (isMotorRunning) {
        if (doorsAreClosed) {
            start()
        } else {
            closeDoors()
        }
    } else {
        closeDoors()
    }


}

// Die Funktionen start() und closeDoors() sind vorgegeben.
fun start() {
    println("Software gestartet.")
}

fun closeDoors() {
    println("Bitte alle Türen schließen.")
}

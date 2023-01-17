fun main() {

    logIn(true, true, true)
}

fun logIn(userAccepted: Boolean, passwortOK: Boolean, connectionSecure: Boolean) {

    if (userAccepted) {
        println("User Accepted")
        if (passwortOK) {
            println("Password OK")
            if (connectionSecure) {
                println("Connection Secure")
            } else {
                println("Unsafe Connection")
            }
        } else {
            println("False Password")
        }
    } else {
        println("User Denied")
    }
}

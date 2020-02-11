package kotlin_caesar

import java.util.*

class Encryption {
    private val sc: Scanner = Scanner(System.`in`)
    private var message: String? = null
        private set
    var encryptedMessage: String
        private set
    var key: Int
        private set

    constructor(message: String?, key: Int) {
        this.message = message
        this.key = key
        encryptedMessage = ""
    }

    constructor() {
        key = 3
        encryptedMessage = ""
    }

    fun plaintextMessage() {
        print("Enter a message: ")
        message = sc.nextLine()
        print("Enter key: ")
        key = sc.nextInt()
    }

    /**
     * The 'if' loop is replaced by the 'when' loop.
     */
    fun encrypt() {
        for (element in message!!) {
            var ch = element
            // below the commented 'if' version of the loop
            when (ch) {
                in 'a'..'z' -> {
                    ch = (ch.toInt() + key).toChar()
                    if (ch > 'z') {
                        ch = (ch - 'z' + 'a'.toInt() - 1).toChar()
                    }
                    encryptedMessage += ch
                }
                in 'A'..'Z' -> {
                    ch = (ch.toInt() + key).toChar()
                    if (ch > 'Z') {
                        ch = (ch - 'Z' + 'A'.toInt() - 1).toChar()
                    }
                    encryptedMessage += ch
                }
                else -> {
                    encryptedMessage += ch
                }
            }
        }
        println("Encrypted Message = $encryptedMessage")
    }
}

/*
if (ch in 'a'..'z') {
    ch = (ch.toInt() + key).toChar()
    if (ch > 'z') {
        ch = (ch - 'z' + 'a'.toInt() - 1).toChar()
    }
    encryptedMessage += ch
} else if (ch in 'A'..'Z') {
    ch = (ch.toInt() + key).toChar()
    if (ch > 'Z') {
        ch = (ch - 'Z' + 'A'.toInt() - 1).toChar()
    }
    encryptedMessage += ch
} else {
    encryptedMessage += ch
}*/
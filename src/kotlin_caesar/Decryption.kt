package kotlin_caesar

import java.util.*

class Decryption {
    private val sc: Scanner = Scanner(System.`in`)
    private var message: String? = null
    var decryptedMessage = ""
        private set
    private var key: Int

    constructor(message: String?, key: Int) {
        this.message = message
        this.key = key
    }

    constructor() {
        key = 3
    }

    fun cipherMessage() {
        print("Enter a message: ")
        message = sc.nextLine()
        print("Enter key: ")
        key = sc.nextInt()
    }

    fun decrypt() {
        decryptedMessage = getDecrypt(decryptedMessage, key, message)
        println("Decrypted message = $decryptedMessage")
    }

    companion object {
        fun getDecrypt(tempMessage: String, i: Int, message: String?): String {
            var tempMessage = tempMessage
            for (element in message!!) {
                var ch = element
                when (ch) {
                    in 'a'..'z' -> {
                        ch = (ch.toInt() - i).toChar()
                        if (ch < 'a') {
                            ch = (ch + 'z'.toInt() - 'a'.toInt() + 1)
                        }
                        tempMessage += ch
                    }
                    in 'A'..'Z' -> {
                        ch = (ch.toInt() - i).toChar()
                        if (ch < 'A') {
                            ch = (ch + 'Z'.toInt() - 'A'.toInt() + 1)
                        }
                        tempMessage += ch
                    }
                    else -> {
                        tempMessage += ch
                    }
                }
            }
            return tempMessage
        }
    }
}
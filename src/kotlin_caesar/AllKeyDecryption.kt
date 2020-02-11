package kotlin_caesar
import java.util.*

class AllKeyDecryption {
    private val sc: Scanner = Scanner(System.`in`)
    private var message: String? = null
    private val decryptedMessage = arrayOfNulls<String>(26)

    constructor(message: String?) {
        this.message = message
    }

    constructor() {}

    fun printDecryptedMessages(): String {
        var msg = "\n"
        for (i in 0..25) { //
            msg += if (i < 10) "key = " + i + " \t" + decryptedMessage[i] + "\n" else "key = $i\t" + decryptedMessage[i] + "\n"
        }
        return msg
    }

    fun cipherMessage() {
        print("Enter a message: ")
        message = sc.nextLine()
    }

    fun decrypt() {
        var tempMessage = ""
        for (i in 0..25) {
            tempMessage = ""
            tempMessage = Decryption.getDecrypt(tempMessage, i, message)
            decryptedMessage[i] = tempMessage
        }
    }
}
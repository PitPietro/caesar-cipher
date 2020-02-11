package kotlin_caesar

import java.util.*

object KMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner: Scanner = Scanner(System.`in`)
        var c: Int

        do {
            print("\n\n|Caesar Cipher|\n0) Exit\n1) Encrypt a message\n2) Decrypt a message\n" +
                    "3) Find all the combination from an encrypted message\nEnter the number: ")
            c = scanner.nextInt()

            when(c) {
                0 -> print("Good bye!")
                1 -> {
                    val e = Encryption()
                    e.plaintextMessage()
                    e.encrypt()
                }
                2 -> {
                    val d = Decryption()
                    d.cipherMessage()
                    d.decrypt()
                }
                3 -> {
                    val dAll = AllKeyDecryption()
                    dAll.cipherMessage()
                    dAll.decrypt()
                    println(dAll.printDecryptedMessages())
                }
                else -> println("I can't do nothing whit this number")
            }
        } while (c != 0)
    }
}
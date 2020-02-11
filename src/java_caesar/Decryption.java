import java.util.Scanner;

public class Decryption {
    private Scanner sc = new Scanner(System.in);
    private String message;
    private String decryptedMessage = "";
    private int key;

    public String getDecryptedMessage() {
        return decryptedMessage;
    }

    public Decryption(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public Decryption() {
        this.key = 3;
    }

    public void cipherMessage() {
        System.out.print("Enter a message: ");
        message = sc.nextLine();

        System.out.print("Enter key: ");
        key = sc.nextInt();
    }

    public void decrypt() {
        decryptedMessage = getDecrypt(decryptedMessage, key, message);

        System.out.println("Decrypted message = " + decryptedMessage);
    }

    static String getDecrypt(String tempMessage, int i, String message) {
        for (int j = 0; j < message.length(); ++j) {
            char ch = message.charAt(j);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - i);

                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }

                tempMessage += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - i);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }

                tempMessage += ch;
            } else {
                tempMessage += ch;
            }
        }
        return tempMessage;
    }
}

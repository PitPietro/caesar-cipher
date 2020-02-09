import java.util.Scanner;

public class AllKeyDecryption {
    private Scanner sc = new Scanner(System.in);
    private String message;
    private String[] decryptedMessage = new String[26];

    public AllKeyDecryption(String message) {
        this.message = message;
    }

    public AllKeyDecryption() { }


    public String printDecryptedMessages() {
        String msg = "\n";
        for (int i = 0; i < 26; ++i) {
            //
            if(i < 10) msg += "key = " + i + " \t" + decryptedMessage[i] + "\n";
            else msg += "key = " + i + "\t" + decryptedMessage[i] + "\n";

        }
        return msg;
    }

    public void cipherMessage() {
        System.out.print("Enter a message: ");
        message = sc.nextLine();
    }

    public void decrypt() {
        String tempMessage = "";
        for (int i = 0; i < 26; ++i) {
            tempMessage = "";
            tempMessage = Decryption.getDecrypt(tempMessage, i, message);
            decryptedMessage[i] = tempMessage;
        }
    }



}
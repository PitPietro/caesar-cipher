package java_caesar;

import java.util.Scanner;

public class Encryption {
    private Scanner sc = new Scanner(System.in);
    private String message;
    private String encryptedMessage;
    private int key;

    public Encryption(String message, int key) {
        this.message = message;
        this.key = key;
        this.encryptedMessage = "";
    }

    public Encryption() {
        this.key = 3;
        this.encryptedMessage = "";
    }

    public void plaintextMessage() {
        System.out.print("Enter a message: ");
        message = sc.nextLine();

        System.out.print("Enter key: ");
        key = sc.nextInt();
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }

    public void encrypt() {
        for(int i = 0; i < message.length(); ++i){
            char ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }

        System.out.println("Encrypted Message = " + encryptedMessage);
    }
}
public class Main {
    public static void main(String[] args) {
        Encryption e = new Encryption();

        e.plaintextMessage();
        e.encrypt();

        AllKeyDecryption a = new AllKeyDecryption(e.getEncryptedMessage());
        a.decrypt();
        System.out.println(a.printDecryptedMessages());

        Decryption d = new Decryption(e.getEncryptedMessage(), e.getKey());
        d.decrypt();
    }
}

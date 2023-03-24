import java.util.Scanner;

public class CipherRunner {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        VigenereCipher vigenereCipher = new VigenereCipher();
        CaesarCipher caesarCipher = new CaesarCipher();
        RailFenceCipher railFenceCipher = new RailFenceCipher();
        RandomCipher randomCipher = new RandomCipher();

        System.out.println("========================");
        System.out.println("   Encryption Program   ");
        System.out.println("========================");

        while (true) {
            System.out.println("\nChoose an encryption method:");
            System.out.println("1. Vigenere Cipher");
            System.out.println("2. Caesar Cipher");
            System.out.println("3. Rail Fence Cipher");
            System.out.println("0. Exit");



            int choice = key.nextInt();
            key.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Please enter the message to encrypt: ");
            String message = key.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Please enter the key for Vigenere Cipher: ");
                    String key1 = key.nextLine();
                    System.out.println("Encrypted message: " + vigenereCipher.encrypt(message, key1));
                    System.out.println("Decrypted message: " + vigenereCipher.decrypt(vigenereCipher.encrypt(message, key1), key1));
                    break;
                case 2:
                    System.out.print("Please enter the shift for Caesar Cipher: ");
                    int shift = key.nextInt();
                    key.nextLine();
                    System.out.println("Encrypted message: " + caesarCipher.encrypt(message, shift));
                    System.out.println("Decrypted message: " + caesarCipher.decrypt(caesarCipher.encrypt(message, shift), shift));
                    break;
                case 3:
                    System.out.print("Please enter the number of rails for Rail Fence Cipher: ");
                    int rails = key.nextInt();
                    key.nextLine();
                    System.out.println("Encrypted message: " + railFenceCipher.encrypt(message, rails));
                    System.out.println("Decrypted message: " + railFenceCipher.decrypt(railFenceCipher.encrypt(message, rails), rails));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}

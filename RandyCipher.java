import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandyCipher{

    private static Map<Character, Character> cipherMap;

    public static void main(String[] args) {
        cipherMap = new HashMap<>();
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the substitution key: ");
        String input = key.nextLine().toUpperCase();

        if (input.length() != 26) {
            System.out.println("Invalid key! Key should be 26 unique uppercase letters.");
            return;
        }

        // populate the cipherMap
        for (int i = 0; i < input.length(); i++) {
            cipherMap.put((char) (i + 'A'), input.charAt(i));
        }

        System.out.print("Enter the message to encrypt: ");
        String message = key.nextLine().toUpperCase();

        // encrypt the message
        String encrypted = encrypt(message);

        System.out.println("Encrypted message: " + encrypted);

        // decrypt the message
        String decrypted = decrypt(encrypted);

        System.out.println("Decrypted message: " + decrypted);

        scanner.close();
    }

    private static String encrypt(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            sb.append(cipherMap.getOrDefault(c, c));
        }
        return sb.toString();
    }

    private static String decrypt(String encrypted) {
        StringBuilder sb = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            for (Map.Entry<Character, Character> entry : cipherMap.entrySet()) {
                if (entry.getValue().equals(c)) {
                    sb.append(entry.getKey());
                    break;
                }
            }
        }
        return sb.toString();
    }
}

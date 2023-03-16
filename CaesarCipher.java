public class CaesarCipher {
    public String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    shifted = (char) (shifted - 26);
                }
                result.append(shifted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public String decrypt(String encrypted, int shift) {
        return encrypt(encrypted, 26 - shift);
    }
}

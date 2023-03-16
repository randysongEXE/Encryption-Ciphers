public class VigenereCipher {
    public String encrypt(String message, String key) {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char keyChar = key.charAt(keyIndex % key.length());
                int shift = Character.toLowerCase(keyChar) - 'a' + 1;
                char shifted = (char) (c + shift);
                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    shifted = (char) (shifted - 26);
                }
                result.append(shifted);
                keyIndex++;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public String decrypt(String encrypted, String key) {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;

        for (char c : encrypted.toCharArray()) {
            if (Character.isLetter(c)) {
                char keyChar = key.charAt(keyIndex % key.length());
                int shift = Character.toLowerCase(keyChar) - 'a' + 1;
                char shifted = (char) (c - shift);
                if ((Character.isLowerCase(c) && shifted < 'a') || (Character.isUpperCase(c) && shifted < 'A')) {
                    shifted = (char) (shifted + 26);
                }
                result.append(shifted);
                keyIndex++;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}

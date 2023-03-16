# Encryption-Ciphers
Encryption is the process of turning plain text, images, or other sources of information into a ciphertext, or text that can only be deciphered with the correct key. 
Here, this application allows the encryption of plain-text through a couple possible techniques:
- Caesar Cipher
- Vigenere Cipher
- Rail Fence Cipher

The Caesar Cipher is one of the earliest and simplest encryption techniques, and is classified as a substitution cipher. Given an inputted text, each character is replaced by a letter with a fixed number of positions down the alphabet. For example, a shift of 1 would replace A --> B, B --> C, etc. In this application, the Caesar Cipher takes in both a message and a shift key, and outputs the appropriate message. Note that this cipher should not be used to encrypt actual messages, as it is highly vulnerable to breakage by modern techniques.

The Vigenere Cipher is a method of encrypting alphabetic text, and is classified as a polyalphabetic substitution cipher. A table consisting of the alphabets written out 26 times in different rows, with each alphabet shifted cyclically to the left compared to the previous alphabet, is used to encrypt the text. At different points in the encryption method, the cipher will choose a different alphabet from one of the rows, which is entirely dependent on a keyword entered by the user. 

![image](https://user-images.githubusercontent.com/127687854/225671313-0126a5fb-7a2f-4e40-a7ab-9263464cdc77.png)



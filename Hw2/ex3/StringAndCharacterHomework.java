package oop.Hw2.ex3;
import java.util.Scanner;
public class StringAndCharacterHomework {
    public static void main(String[] args) {
        testExchangeCipher();
        testPalindromicWord();
        testPalindromicPhrase();
    }
    // Exchange Cipher
    public static String exchangeCipher(String inStr) {
        inStr = inStr.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char cipherChar = (char) ('A' + 'Z' - ch);
                cipherText += cipherChar;
            } else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
    public static void testExchangeCipher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        String cipherText = exchangeCipher(inStr);
        System.out.println("The ciphertext string is: " + cipherText);
    }
    // TestPalindromicWord and TestPalindromicPhrase
    public static boolean isPalindromicWord(String inStr) {
        inStr = inStr.toLowerCase();
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        while(fIdx < bIdx) {
            if(inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }
    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inStr = sc.nextLine();
        if(isPalindromicWord(inStr)) {
            System.out.println("\"" + inStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindrome.");
        }
    }
    public static boolean isPalindromicPhrase(String inStr) {
        inStr = inStr.toLowerCase();
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        while(fIdx < bIdx) {
            while(fIdx < bIdx && !Character.isLetter(inStr.charAt(fIdx))) {
                fIdx++;
            }
            while(fIdx < bIdx && Character.isLetter(inStr.charAt(fIdx))) {
                fIdx--;
            }
            if(inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }
    public static void testPalindromicPhrase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String inStr = sc.nextLine();
        if(isPalindromicPhrase(inStr)) {
            System.out.println("\"" + inStr + "\" is a palindrome.");
        }else {
            System.out.println("\"" + inStr + "\" is not a palindrome.");
        }
    }
}

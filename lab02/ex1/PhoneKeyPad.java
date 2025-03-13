package oop.lab02.ex1;
import java.util.Scanner;

public class PhoneKeyPad{
    public static void main(String[] args) {
        testPhoneKeyPad();
    }
    public static String phoneKeyPadIf(String inStr) {
        inStr = inStr.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char ch : inStr.toCharArray()) {
            if (ch >= 'a' && ch <= 'c') {
                result.append("2");
            } else if (ch >= 'd' && ch <= 'f') {
                result.append("3");
            } else if (ch >= 'g' && ch <= 'i') {
                result.append("4");
            } else if (ch >= 'j' && ch <= 'l') {
                result.append("5");
            } else if (ch >= 'm' && ch <= 'o') {
                result.append("6");
            } else if (ch >= 'p' && ch <= 's') {
                result.append("7");
            } else if (ch >= 't' && ch <= 'v') {
                result.append("8");
            } else if (ch >= 'w' && ch <= 'z') {
                result.append("9");
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static String phoneKeyPadSwitch(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();

        for (char ch : inStr.toCharArray()) {
            switch (ch) {
                case 'a': case 'b': case 'c':
                    result.append("2");
                    break;
                case 'd': case 'e': case 'f':
                    result.append("3");
                    break;
                case 'g': case 'h': case 'i':
                    result.append("4");
                    break;
                case 'j': case 'k': case 'l':
                    result.append("5");
                    break;
                case 'm': case 'n': case 'o':
                    result.append("6");
                    break;
                case 'p': case 'q': case 'r': case 's':
                    result.append("7");
                    break;
                case 't': case 'u': case 'v':
                    result.append("8");
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    result.append("9");
                    break;
                default:
                    result.append(ch);
            }
        }
        return result.toString();
    }
    public static void testPhoneKeyPad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Using Nested-If: " + phoneKeyPadIf(input));
        System.out.println("Using Switch-Case: " + phoneKeyPadSwitch(input));
    }
}


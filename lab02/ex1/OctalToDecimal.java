package oop.lab02.ex1;
import java.util.Scanner;

public class OctalToDecimal {
    public static int octalToDecimal(String octalStr) {
        int decimal = 0;
        int length = octalStr.length();

        for (int i = 0; i < length; i++) {
            char digitChar = octalStr.charAt(i);
            int digit = digitChar - '0';

            if (digit < 0 || digit > 7) {
                throw new IllegalArgumentException("Invalid octal digit: " + digitChar);
            }
            decimal = decimal * 8 + digit;
        }

        return decimal;
    }
    public static void testOctalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalStr = scanner.nextLine();

        try {
            int decimal = octalToDecimal(octalStr);
            System.out.println("The equivalent decimal number \"" + octalStr + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testOctalToDecimal();
    }
}


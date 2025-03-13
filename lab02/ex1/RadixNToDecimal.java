package oop.lab02.ex1;
import java.util.Scanner;

public class RadixNToDecimal {
    // Method to convert a string of any radix (≤16) to decimal
    public static int radixNToDecimal(String radixNStr, int radix) {
        if (radix < 2 || radix > 16) {
            throw new IllegalArgumentException("Radix must be between 2 and 16.");
        }

        int decimal = 0;
        int length = radixNStr.length();

        for (int i = 0; i < length; i++) {
            char digitChar = radixNStr.charAt(i);
            int digit;

            if (Character.isDigit(digitChar)) {
                digit = digitChar - '0';
            } else if (Character.isLetter(digitChar)) {
                digit = Character.toUpperCase(digitChar) - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid character in input string: " + digitChar);
            }

            if (digit >= radix) {
                throw new IllegalArgumentException("Invalid digit " + digitChar + " for radix " + radix);
            }

            decimal = decimal * radix + digit;
        }

        return decimal;
    }

    // Method to test radixNToDecimal
    public static void testRadixNToDecimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the string: ");
        String radixNStr = scanner.nextLine();

        try {
            int decimal = radixNToDecimal(radixNStr, radix);
            System.out.println("The equivalent decimal number \"" + radixNStr + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testRadixNToDecimal();
    }
}


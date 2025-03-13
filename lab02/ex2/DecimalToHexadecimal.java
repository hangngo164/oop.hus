package oop.lab02.ex2;
import java.util.Scanner;

public class DecimalToHexadecimal {
    public static String decimalToHexadecimal(int positiveInteger) {
        if (positiveInteger < 0) {
            throw new IllegalArgumentException("Number must be a positive integer.");
        }
        return Integer.toHexString(positiveInteger).toUpperCase();
    }
    public static void testDecimalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        try {
            String hexStr = decimalToHexadecimal(decimalNumber);
            System.out.println("The equivalent hexadecimal number is " + hexStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testDecimalToHexadecimal();
    }
}


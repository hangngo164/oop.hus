package oop.lab02.ex2;
import java.util.Scanner;

public class HexadecimalToBinary {
    public static String hexadecimalToBinary(String hexStr) {
        StringBuilder binaryStr = new StringBuilder();

        for (char hexChar : hexStr.toUpperCase().toCharArray()) {
            String binary = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexChar), 16));
            binaryStr.append(String.format("%4s", binary).replace(' ', '0')).append(" ");
        }

        return binaryStr.toString().trim();
    }
    public static void testHexadecimalToBinary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = scanner.nextLine();

        try {
            String binaryStr = hexadecimalToBinary(hexStr);
            System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binaryStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid hexadecimal input.");
        }

        scanner.close();
    }
    public static void main(String[] args) {
        testHexadecimalToBinary();
    }
}


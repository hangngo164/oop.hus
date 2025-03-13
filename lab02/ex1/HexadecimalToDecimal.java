package oop.lab02.ex1;
import java.util.Scanner;
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        testHexadecimalToDecimal();
    }
    public static int hexadecimalToDecimal(String hexStr) {
        int len = hexStr.length();
        int base = 1;
        int dec_val = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (hexStr.charAt(i) >= '0'
                    && hexStr.charAt(i) <= '9') {
                dec_val += (hexStr.charAt(i) - 48) * base;
                base = base * 16;
            }
            else if (hexStr.charAt(i) >= 'A'
                    && hexStr.charAt(i) <= 'F') {
                dec_val += (hexStr.charAt(i) - 55) * base;
                base = base * 16;
            }
        }

        return dec_val;
    }

    public static void testHexadecimalToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = sc.nextLine();
        int result = hexadecimalToDecimal(hexStr.toUpperCase());
        System.out.println("The equivalent decimal number for binary " + "\"" + hexStr + "\""  + " is: "+ result);
    }
}

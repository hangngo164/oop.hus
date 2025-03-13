package oop.Hw2.ex5;
import java.util.Scanner;
public class NumberSystemConversion {
    public static int charToValue(char c) {
        if (c >= '0' && c <= '9') return c - '0';
        if (c >= 'A' && c <= 'Z') return c - 'A' + 10;
        if (c >= 'a' && c <= 'z') return c - 'a' + 10;
        throw new IllegalArgumentException("Invalid character: " + c);
    }
    // Chuyển số nguyên thành ký tự ('0'-'9', 'A'-'Z')
    public static char valueToChar(int value) {
        if (value < 10)
            return (char) ('0' + value);
        return (char) ('A' + value - 10);
    }
    // Chuyển từ hệ cơ số inRadix sang hệ 10 bằng phương pháp Horner
    public static int toDecimalHorner(String in, int inRadix) {
        int decimalValue = 0;
        for (int i = 0; i < in.length(); i++) {
            decimalValue = decimalValue * inRadix + charToValue(in.charAt(i));
        }
        return decimalValue;
    }
    // Chuyển từ hệ 10 sang hệ outRadix bằng phương pháp chia liên tục
    public static String fromDecimal(int decimal, int outRadix) {
        if (decimal == 0)
            return "0";
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.insert(0, valueToChar(decimal % outRadix));
            decimal /= outRadix;
        }
        return result.toString();
    }

    // Chuyển trực tiếp từ hệ inRadix sang outRadix
    public static String toRadix(String in, int inRadix, int outRadix) {
        int decimalValue = toDecimalHorner(in, inRadix); // Đổi sang hệ 10
        return fromDecimal(decimalValue, outRadix);  // Đổi từ hệ 10 sang outRadix
    }

    public static void testNumberConversion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();

        System.out.print("Enter the input radix: ");
        int inputRadix = scanner.nextInt();

        System.out.print("Enter the output radix: ");
        int outputRadix = scanner.nextInt();

        String result = toRadix(inputNumber, inputRadix, outputRadix);

        System.out.println("\"" + inputNumber + "\" in radix " + inputRadix +
                " is \"" + result + "\" in radix " + outputRadix + ".");

    }

    public static void main(String[] args) {
        testNumberConversion();
    }
}

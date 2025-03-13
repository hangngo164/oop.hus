package oop.lab02.ex3;
import java.util.Scanner;

public class MethodExercise {
    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
    public static void testExponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        if (exp < 0) {
            System.out.println("Error: Exponent must be a non-negative integer.");
        } else {
            System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testExponent();
    }
}

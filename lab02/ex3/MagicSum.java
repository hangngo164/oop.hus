package oop.lab02.ex3;
import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static int testMagicSum(Scanner in) {
        final int SENTINEL = -1;
        int sum = 0;
        int number;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicSum = testMagicSum(scanner);
        System.out.println("The magic sum is: " + magicSum);
        scanner.close();
    }
}


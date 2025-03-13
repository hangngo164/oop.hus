package oop.Hw2.ex5;

import java.sql.SQLOutput;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("The factorial with Integer: ");
        factorialInt();
        System.out.println("The factorial with Long: ");
        factorialLong();
    }
    public static void factorialInt() {
        int i = 1;
        int factorial = 1;

        while (true) {
            System.out.println("The factorial of " + i + " is " + factorial);
            if (Integer.MAX_VALUE / factorial < (i + 1)) {
                System.out.println("The factorial of " + (i + 1) + " is out of range");
                break;
            }
            i++;
            factorial *= i;
        }
    }
    public static void factorialLong() {
        long factorial = 1;
        int i = 1;
        while (true) {
            System.out.println("The factorial of " + i + " is " + factorial);
            if (Long.MAX_VALUE / factorial < (i + 1)) {
                System.out.println("The factorial of " + (i + 1) + " is out of range");
                break;
            }

            i++;
            factorial *= i;
        }
    }
}


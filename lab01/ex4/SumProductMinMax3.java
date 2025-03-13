package oop.lab01.ex4;
import java.util.Scanner;
public class SumProductMinMax3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();
        sc.close();
        printSumProductMinMax3(number1, number2, number3);
    }
    public static void printSumProductMinMax3(int number1, int number2, int number3) {
        System.out.println("The sum is: " + sum3(number1, number2, number3));
        System.out.println("The product is: " + product3(number1, number2, number3));
        System.out.println("The min is: " + min3(number1, number2, number3));
        System.out.println("The max is: " + max3(number1, number2, number3));
    }

    public static int sum3(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static int product3(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    public static int min3(int number1, int number2, int number3) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        return min;
    }

    public static int max3(int number1, int number2, int number3) {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }
}

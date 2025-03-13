package oop.lab03.ex3;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors:");
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[ %d numbers found (%.2f%%) ]\n", count, (100.0 * count / upperBound));
    }
    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= aPosInt; i++) {
                if (aPosInt % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        int num = aPosInt;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                product *= i;
                num /= i;
            }
        }
        return product == aPosInt;
    }
}

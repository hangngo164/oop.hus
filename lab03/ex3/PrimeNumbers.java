package oop.lab03.ex3;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are prime:");
        int primeCount = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.printf("\n[ %d primes found (%.2f%%) ]\n", primeCount, (100.0 * primeCount / upperBound));

    }
    public static boolean isPrime(int aPosInt) {
        if(aPosInt < 2) {
            return false;
        }else {
            for(int i = 2; i < aPosInt; i++){
                if(aPosInt % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

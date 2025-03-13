package oop.lab03.ex3;
import java.util.Scanner;
public class PerfectandDeficientNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are perfect:");
        int perfectCount = 0;
        for(int i = 1; i <= upperBound; i++) {
            if(isPerfect(i)) {
                perfectCount++;
            }
        }
        System.out.println("\n[" + perfectCount + " perfect numbers found (" + (100.0 * perfectCount / upperBound) + "%) ]");
        System.out.println("\nThese numbers are neither deficient nor perfect:");
        int neitherCount = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                neitherCount++;
            }
        }
        System.out.println("\n[ " + neitherCount + " numbers found (" + (100.0 * neitherCount / upperBound) + "%) ]");
    }
    public static boolean isPerfect(int aPosInt) {
        int sum =0;
        for(int i =1; i < aPosInt; i++) {
            if(aPosInt % i == 0) {
                sum +=i;
            }
        }
        return sum == aPosInt;
    }
    public static boolean isDeficient(int aPosInt) {
        int sum =0;
        for(int i =1; i < aPosInt; i++) {
            if(aPosInt % i == 0) {
                sum +=i;
            }
        }
        return sum < aPosInt;
    }
}

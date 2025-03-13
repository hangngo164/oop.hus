package oop.Hw2.ex5;
import java.util.Scanner;
public class TrigonometricSeries {
    public static void main(String[] args) {
        testTrigonometric();
    }
    public static double sin(double x, int numTerms) {
        double term = x, sum = x;
        for(int i = 1; i < numTerms; i++) {
            term = term * ((-x) * x)/ ((2 * i + 1) * (2 *i));
            sum = sum + term;
        }
        return sum;

    }
    public static double cos(double x, int numTerms) {
        double term = 1, sum = 1;
        for(int i = 1; i < numTerms; i++) {
            term *= -x * x/ ((2 * i - 1) * (2 * i));
            sum = sum + term;
        }
        return sum;
    }
    public static void testTrigonometric() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x (in radians): ");
        double x = sc.nextDouble();
        System.out.println("Enter number of terms: ");
        int numTerms = sc.nextInt();
        System.out.printf("sin(%f) using Taylor: %f\n", x, sin(x, numTerms));
        System.out.printf("sin(%f) using Math.sin: %f\n", x, Math.sin(x));
        System.out.printf("cos(%f) using Taylor: %f\n", x, cos(x, numTerms));
        System.out.printf("cos(%f) using Math.cos(x): %f\n", x, Math.cos(x));

    }
}

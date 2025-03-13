package oop.Hw2.ex5;
import java.util.Scanner;
public class ExponentialSeries {
    public static void main(String[] args) {
        testSpecialSeries();
    }
    public static double specialSeries(double x, int numTerms) {
        if( x < -1 || x > 1) {
            throw new IllegalArgumentException(" x phải nằm trong khoảng [-1,1]");
        }
        double sum = x;
        double numerator = 1;
        double denominator =2;
        double term = x;
        for(int i = 1; i < numTerms; i++) {
            numerator *= (2 * i - 1);
            denominator *= (2 * i);
            term *= (x * x) / ((2 * i +1));
            sum += (numerator / denominator) * term;
        }
        return sum;
    }
    public static void testSpecialSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        System.out.print("Nhập số lượng số hạng: ");
        int numTerms = sc.nextInt();
        double result = specialSeries(x,numTerms);
        System.out.printf("Giá trị của chuỗi với x = %.6f và %d số hạng là: %.10f\n ", x, numTerms, result);
    }
}

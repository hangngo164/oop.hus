package oop.Hw2.ex5;

public class FibonacciInt {
    public static void main(String[] args) {
        fibonacciInt();
        tribonacciInt();
    }
    public static void fibonacciInt() {
        int prev = 1;
        int curr = 1;
        int n =0;
        System.out.println("F(" + n + ")= " + prev);
        n++;
        System.out.println("F(" + n + ")= " + curr);
        while(Integer.MAX_VALUE - curr >= prev) {
            int next = prev + curr;
            n++;
            System.out.println("F(" + n + ")= " + next);
            prev = curr;
            curr = next;
        }
        System.out.println("F(" + (n +1)  + ") is out of the range of integer.");
    }
    // Write a similar method called tribonacciInt() for Tribonacci numbers.
    public static void tribonacciInt() {
        int t0 = 1;
        int t1 = 1;
        int t2 = 1;
        int n = 0;
        System.out.println("T(" + n + ")= " + t0);
        n++;
        System.out.println("T(" + n + ")= " + t1);
        n++;
        System.out.println("T(" + n + ")= " + t2);
        while (Integer.MAX_VALUE - t2 >= t1 + t0) {
            int next = t0 + t1 + t2;
            n++;
            System.out.println("T(" + n + ")= " + next);
            t0 = t1;
            t1 = t2;
            t2 = next;
        }
        System.out.println("T(" + (n + 1) + " is out of the range of integer.");
    }
}

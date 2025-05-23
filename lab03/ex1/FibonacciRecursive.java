package oop.lab03.ex1;
import java.util.Scanner;
public class FibonacciRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci : " + fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==0) {
            return 0;
        }else if (n==1) {
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

package oop.lab03.ex1;
import java.util.Scanner;
public class FactorialRecusive {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}

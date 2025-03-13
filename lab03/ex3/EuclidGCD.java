package oop.lab03.ex3;
import java.util.Scanner;
public class EuclidGCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println("Invalid input");
        } else {
            if( a < b){
                int temp = a;
                a = b;
                b = temp;
            }
            System.out.println("GCD(" + a + "," + b + ") = " + gcd(a, b) );
        }
    }
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

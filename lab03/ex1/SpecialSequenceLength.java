package oop.lab03.ex1;
import java.util.Scanner;
public class SpecialSequenceLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Length of S(" + n + ") = " + len(n));
    }
    public static int numOfDigits(int n){
        return String.valueOf(n).length();
    }
    public static int len(int n){
        if(n ==1) {
            return 1;
        }
        return len(n-1) + numOfDigits(n);
    }
}

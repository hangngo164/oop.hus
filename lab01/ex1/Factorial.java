package oop.lab01.ex1;

public class Factorial {
    public static void main(String[] args){
        long n = 20;
        long factorial = 1;
        for(int i = 1; i <=n; i++){
            factorial = factorial * i;
        }
        System.out.println("The Factorial of" + n + "is" + factorial);
    }
}

package oop.lab01.ex2;

public class CheckOddEven {
    public static void main(String[] args){
        checkOddEven(0);
        checkOddEven(1);
        checkOddEven(88);
        checkOddEven(99);
        checkOddEven(-1);
        checkOddEven(-2);
    }
    public static void checkOddEven(int number){
        System.out.println("The number is " + number);
        if(number % 2 == 0){
            System.out.println( number + " is an even number");
        }else{
            System.out.println(number +" is an odd number");
        }
        System.out.println("Bye!");
    }
}

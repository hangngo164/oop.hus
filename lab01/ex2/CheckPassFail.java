package oop.lab01.ex2;

public class CheckPassFail {
    public static void main(String[] args){
        checkPass(0);
        checkPass(49);
        checkPass(50);
        checkPass(51);
        checkPass(100);
    }
    public static void checkPass(int mark){
        System.out.println("The mark is " + mark);
        if(mark <=49){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }
        System.out.println("DONE");
    }
}

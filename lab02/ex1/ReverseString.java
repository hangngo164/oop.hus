package oop.lab02.ex1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();
        reverseString(inStr);
    }
    public static String reverseString(String inStr){
        for(int charIdx = inStr.length()-1; charIdx>=0; charIdx--){
            System.out.print(inStr.charAt(charIdx));
        }
        return inStr;
    }
}

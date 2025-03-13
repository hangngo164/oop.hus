package oop.lab02.ex1;
import java.util.Scanner;
public class DecipherCaesarCode {
    public static void main(String[] args) {
        testDecipherCaesarCode();
    }
    public static String decipherCaesarCode(String inStr){
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            result.append((char)(ch -3));
        }
        return result.toString();
    }
    public static void testDecipherCaesarCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inStr = sc.nextLine();
        System.out.println(decipherCaesarCode(inStr));
    }
}

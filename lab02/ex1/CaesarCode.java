package oop.lab02.ex1;
import java.util.Scanner;
public class CaesarCode {
    public static void main(String[] args) {
        testCipherCaesarCode();
    }
    public static String cipherCaesarCode(String inStr){
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for(int i =0; i<inStr.length(); i++){
            char ch = inStr.charAt(i);
            result.append((char)(ch + 3));
        }
        return result.toString();
    }
    public static void testCipherCaesarCode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = sc.nextLine();
        System.out.println(cipherCaesarCode(inStr));
    }
}

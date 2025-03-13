package oop.lab02.ex1;
import java.util.Scanner;
public class CountVowelsDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int vowelCount = countVowels(str);
        int digitCount = countDigits(str);
        int total = str.length();
        double vowelPercent = (double) vowelCount / total * 100;
        double digitPercent = (double) digitCount / total * 100;
        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelCount, vowelPercent);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitCount, digitPercent);
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean isDigit( char c){
        return c >='0' && c<='9';
    }
    public static int countVowels(String inStr){
        int count =0;
        for(int i =0; i < inStr.length(); i++){
            if(isVowel(inStr.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String inStr){
        int count = 0;
        for(int i =0; i < inStr.length(); i++){
            if(isDigit(inStr.charAt(i))){
                count++;
            }
        }
        return count;
    }

}

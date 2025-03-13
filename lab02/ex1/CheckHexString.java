package oop.lab02.ex1;
import java.util.Scanner;
public class CheckHexString {
    public static void main(String[] args) {
        testHexString();
    }
    public static boolean isHexString(String hexStr){
        for(int i =0; i < hexStr.length(); i++){
            char ch = hexStr.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))){
                return false;
            }
        }
        return true;
    }
    public static void testHexString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex string");
        String inStr = sc.nextLine();
        if(isHexString(inStr)){
            System.out.println(" \" " + inStr + " \" " + " is a hex string");
        }else{
            System.out.println(" \"" + " " + inStr + " \"" + " is Not a hex string");
        }
    }
}

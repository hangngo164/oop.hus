package oop.lab02.ex1;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        testBinaryToDecimal();
    }

    public static int binaryToDecimal(String binaryStr) {
        int binary = Integer.parseInt(binaryStr);
        int decimal = 0;
        if (!isBinary(binaryStr)) decimal = -1;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static boolean isBinary(String binaryStr) {
        for (int i = 0; i < binaryStr.length(); i++) {
            if (!(binaryStr.charAt(i) == '0'
                    || binaryStr.charAt(i) == '1')) return false;
        }
        return true;
    }

    public static void testBinaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binary = sc.nextLine();
        int result = binaryToDecimal(binary);
        if(!isBinary(binary)){
            System.out.println("invalid binary string " + "\"" + binary + "\"");
        }
        else{
            System.out.println("The equivalent decimal number for binary " + "\"" + binary + "\""  + " is: "+ result);
        }
    }
}

package oop.Hw2.Ex4;
import java.util.Scanner;
public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printArrayStars(sc);
    }
    public static void printArrayStars(Scanner in) {
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = in.nextInt();
        if(NUM_ITEMS <= 0) {
            System.out.println("The number of items must be positive integer.");
        }
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i =0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }
        System.out.println();
        for(int i =0; i < NUM_ITEMS; i++) {
            System.out.print(i + ": ");
            for(int j =0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + items[i] + ")");
        }
    }
}

package oop.lab02.ex2;
import java.util.Scanner;

public class PrintArray {
    public static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = in.nextInt();

        int[] items = new int[NUM_ITEMS];
        if (NUM_ITEMS > 0) {
            System.out.print("Enter the values of all items (separated by space): ");
            for (int i = 0; i < NUM_ITEMS; i++) {
                items[i] = in.nextInt();
            }
        }

        return items;
    }
    public static void printArray(int[] arr) {
        System.out.print("The values are: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        printArray(array);
        scanner.close();
    }
}


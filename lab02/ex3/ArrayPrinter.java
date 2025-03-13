package oop.lab02.ex3;
import java.util.Scanner;

public class ArrayPrinter {
    // Method to print int array
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Overloaded method to print double array
    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Overloaded method to print float array
    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Test driver method
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3};
        float[] floatArray = {1.1f, 2.2f, 3.3f};
        int[] emptyArray = {};
        int[] oneElementArray = {42};

        System.out.print("Int array: ");
        print(intArray);
        System.out.print("Double array: ");
        print(doubleArray);
        System.out.print("Float array: ");
        print(floatArray);
        System.out.print("Empty array: ");
        print(emptyArray);
        System.out.print("One element array: ");
        print(oneElementArray);
    }
}


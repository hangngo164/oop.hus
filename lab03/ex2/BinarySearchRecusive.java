package oop.lab03.ex2;
import java.util.Scanner;
public class BinarySearchRecusive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        if(binarySearch(arr, key)) {
            System.out.println("Key " + key + " found in the array.");
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
    public static boolean binarySearchUsingRecusive(int[] arr, int value, int from, int to) {
        if(from > to) {
            return false;
        }
        int mid = (from + to) / 2;
        if (value == arr[mid]) {
            return true;
        }
        if(value < arr[mid]) {
            to = mid -1;
        } else {
            from = mid +1;
        }
        return binarySearchUsingRecusive(arr, value, from, to);
    }
    public static boolean binarySearch(int[] array, int key) {
        return binarySearchUsingRecusive(array, key, 0, array.length - 1);
    }
}

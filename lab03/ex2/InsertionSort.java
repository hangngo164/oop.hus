package oop.lab03.ex2;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr,sc);
        insertionSort(arr);
        System.out.print("Array after sorting: ");
        printArray(arr);
    }
    public static void insertionSort(int[] arr){
        for(int i =1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while(j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void inputArray(int[] arr, Scanner sc){
        System.out.println("Enter the elements of the array");
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

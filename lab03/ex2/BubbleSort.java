package oop.lab03.ex2;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr,sc);
        bubbleSort(arr);
        System.out.print("Array after sorting: ");
        printArray(arr);
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
    public static void bubbleSort(int[] arr) {
        for(int i =0; i < arr.length-1; i++) {
            for(int j =0; j< arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

package oop.lab03.ex2;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr,sc);
        selectionSort(arr);
        System.out.print("Array after sorting: ");
        printArray(arr);
    }
    public static void selectionSort(int[] arr) {
        for(int i =0; i < arr.length -1; i++) {
            int minIndex =i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

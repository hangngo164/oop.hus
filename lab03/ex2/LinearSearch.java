package oop.lab03.ex2;
import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 3, 4, 6, 7, 8, 12, 16, 21};
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        boolean found = linearSearch(array, key);
        System.out.println("Key found: " + found);
        int index = linearSearchIndex(array,key);
        if(index == -1){
            System.out.println("Key not found");
        }else {
            System.out.println("Key " + key + " found at index: " + index);
        }
    }
    public static boolean linearSearch(int[] array, int key){
        for(int i =0; i < array.length; i++){
            if(array[i] == key){
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key){
        for(int i =0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}

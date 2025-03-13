package oop.lab02.ex3;

public class ArrayToString {
    // Method to convert int array to string
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] emptyArray = {};
        int[] oneElementArray = {42};

        System.out.println("Int array: " + arrayToString(intArray));
        System.out.println("Empty array: " + arrayToString(emptyArray));
        System.out.println("One element array: " + arrayToString(oneElementArray));
    }
}


package oop.lab02.ex3;

public class ArrayContains {
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
    public static boolean contains(int[] array, int key) {
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] emptyArray = {};
        int[] oneElementArray = {42};

        System.out.println("Int array: " + arrayToString(intArray));
        System.out.println("Empty array: " + arrayToString(emptyArray));
        System.out.println("One element array: " + arrayToString(oneElementArray));

        System.out.println("Contains 3 in intArray: " + contains(intArray, 3));
        System.out.println("Contains 42 in oneElementArray: " + contains(oneElementArray, 42));
        System.out.println("Contains 7 in intArray: " + contains(intArray, 7));
        System.out.println("Contains 0 in emptyArray: " + contains(emptyArray, 0));
    }
}


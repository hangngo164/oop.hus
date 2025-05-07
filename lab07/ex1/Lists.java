package oop.lab07.ex1;
import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }
    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }
    public static void removeEvil(List<Integer> list) {
        list.remove(Integer.valueOf(666));
    }
    public static List<Integer> generateSquare() {
        List<Integer> squareList = new LinkedList<>();
        for(int i =0; i < 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }
    public static boolean contains(List<Integer> list, int value) {
        for(int element : list) {
            if(element == value) {
                return true;
            }
        }
        return false;
    }
    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for(int element : source) {
            target.add(element);
        }
    }
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }
    public static void reverseManual(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}

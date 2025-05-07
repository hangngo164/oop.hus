package oop.lab07.ex2;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int element : first) {
            if (second.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }
    public static Set<Integer> unionManual (Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        for(int element : first) {
            union.add(element);
        }
        for(int element : second) {
            union.add(element);
        }
        return union;
    }
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new LinkedList<>();
        for(int element : source) {
            if(!list.contains(element)) {
                list.add(element);
            }
        }
        return list;
    }
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        List<Integer> list = new LinkedList<>(set);
        return list;
    }
    public static String firstRecurringCharacter(String s) {
        if(s.isEmpty()) {
            return "";
        }
        List<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(list.contains(ch)) {
                return String.valueOf(ch);
            } else {
                list.add(ch);
            }
        }
        return "";
    }
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> recurring = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                recurring.add(ch);
            } else {
                set.add(ch);
            }
        }
        return recurring;
    }
    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        int i =0;
        for(int element : source) {
            array[i] = element;
            i++;
        }
        return array;
    }
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}

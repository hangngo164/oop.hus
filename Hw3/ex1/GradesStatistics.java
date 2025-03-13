package oop.Hw3.ex1;
import java.util.*;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();

        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f\n", standardDeviation(grades));
    }

    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                int grade = scanner.nextInt();
                if (grade >= 0 && grade <= 100) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Invalid grade! Please enter a number between 0 and 100.");
                }
            }
        }
        scanner.close();
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double standardDeviation(int[] array) {
        double mean = average(array);
        double sumSquaredDiffs = 0;
        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / array.length);
    }
}


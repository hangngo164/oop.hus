package oop.Hw3.ex1;
import java.util.*;

public class GradesHistogram {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        printHorizontalHistogram();
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

    public static void printHorizontalHistogram() {
        int[] bins = new int[10];

        for (int grade : grades) {
            bins[grade / 10]++;
        }

        for (int i = 0; i < bins.length; i++) {
            System.out.printf("%2d - %3d: ", i * 10, (i == 9) ? 100 : i * 10 + 9);
            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



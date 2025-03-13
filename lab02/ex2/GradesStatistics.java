package oop.lab02.ex2;
import java.util.Scanner;
import java.util.Arrays;
public class GradesStatistics {
    public static int[] generateStudentGrades(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        if (numStudents <= 0) {
            throw new IllegalArgumentException("Number of students must be a positive integer.");
        }

        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = in.nextInt();

            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }

            grades[i] = grade;
        }
        return grades;
    }

    // Method to compute and display grade statistics
    public static void simpleGradesStatistics() {
        Scanner scanner = new Scanner(System.in);
        int[] grades = generateStudentGrades(scanner);

        int sum = 0;
        int min = grades[0];
        int max = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }

        double average = (double) sum / grades.length;
        System.out.printf("The average is: %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);

        scanner.close();
    }

    public static void main(String[] args) {
        simpleGradesStatistics();
    }
}


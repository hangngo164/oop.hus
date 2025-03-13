package oop.lab04.ex1p7;
import java.util.Scanner;
public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());

        printComplex(1,complex1);
        printComplex(2,complex2);
        compareComplex(complex1, complex2);
        addComplex(complex1, complex2);
    }
    public static void printComplex(int complexIdx, MyComplex complex) {
        System.out.printf("Number %d is: (%s).%n", complexIdx, complex);
        boolean isReal = complex.isReal();
        System.out.printf("(%s) is%s a pure real number%n", complex, isReal? " " : " NOT");
        boolean isImag = complex.isImag();
        System.out.printf("(%s) is%s a pure imaginary number%n", complex, isImag? " " : " NOT");
    }

    public static void compareComplex(MyComplex complex1, MyComplex complex2) {
        boolean isEqual =  complex1.equals(complex2);
        System.out.printf("(%s) is%s equal to (%s)%n", complex1, isEqual? " " : " NOT", complex2);
    }

    public static void addComplex(MyComplex complex1, MyComplex complex2) {
        MyComplex sumOfTwoComplex = complex1.addNew(complex2);
        System.out.printf("(%s) + (%s) = (%s)%n",
                complex1, complex2, sumOfTwoComplex);
    }
}

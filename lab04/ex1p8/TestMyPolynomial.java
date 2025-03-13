package oop.lab04.ex1p8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial poly2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        System.out.println("Degree of poly1: " + poly1.getDegree());
        System.out.println("Degree of poly2: " + poly2.getDegree());

        System.out.println("poly1(2) = " + poly1.evaluate(2));

        MyPolynomial sum = poly1.add(poly2);
        System.out.println("Sum: " + sum);

        MyPolynomial product = poly1.multiply(poly2);
        System.out.println("Product: " + product);
    }
}

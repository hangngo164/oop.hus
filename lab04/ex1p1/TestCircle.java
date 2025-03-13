package oop.lab04.ex1p1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle1 has radius of " + circle1.getRadius()
        + " and area of " + circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The circle2 has radius of " + circle2.getRadius()
        + " and area of " + circle2.getArea());
        Circle circle3 = new Circle(3.0, "green");
        System.out.println("The " + circle3.getColor() + " circle3 has radius of " + circle3.getRadius()
        + " and area of " + circle3.getArea());
        Circle circle4 = new Circle();
        circle4.setRadius(5.5); // Change radius
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("green"); // Change color
        System.out.println("color is: " + circle4.getColor());
        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());
        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
    }
}

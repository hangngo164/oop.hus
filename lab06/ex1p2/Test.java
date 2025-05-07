package oop.lab06.ex1p2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

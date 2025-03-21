package oop.lab05.ex1p4;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "pink", true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", true);
        System.out.println(rectangle);

        Square square = new Square(3.0, "purple", true);
        System.out.println(square);
        square.setSide(4.0);
        System.out.println(square);
    }
}

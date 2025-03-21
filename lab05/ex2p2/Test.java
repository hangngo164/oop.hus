package oop.lab05.ex2p2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "red");
        circle.setColor("pink");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(4.0, 16.0);
        Circle circle1 = new Circle(5.0, " blue");
        cylinder.setBase(circle1);
        System.out.println(cylinder);
    }
}

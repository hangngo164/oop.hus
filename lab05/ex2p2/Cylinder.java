package oop.lab05.ex2p2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }
    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return base.getArea() * height;
    }
    public String toString() {
        return base.toString() + " " + height;
    }
}

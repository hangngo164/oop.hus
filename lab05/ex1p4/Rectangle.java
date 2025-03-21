package oop.lab05.ex1p4;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        length = 1.0;
        width = 1.0;
    }
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length +  width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +  super.toString() + ", width= " + width + ", length= " + length + "]";
    }
}

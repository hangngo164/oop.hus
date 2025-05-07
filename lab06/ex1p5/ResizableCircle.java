package oop.lab06.ex1p5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}

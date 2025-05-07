package oop.lab10.abstractfactory.ex3;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeShape) {
        if (typeShape.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (typeShape.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}

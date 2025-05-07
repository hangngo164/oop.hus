package oop.lab06.ex1p3;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(15, 20, 9, 10);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}

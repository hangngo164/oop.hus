package oop.lab06.ex1p4;

public class Test {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(21, 12, 4, 3, 5);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}

package oop.lab06.ex1p6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}

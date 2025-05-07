package oop.lab06.ex1p6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}

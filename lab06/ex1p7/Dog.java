package oop.lab06.ex1p7;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}

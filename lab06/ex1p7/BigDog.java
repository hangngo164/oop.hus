package oop.lab06.ex1p7;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }
    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}

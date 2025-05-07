package oop.lab06.ex1p6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.greets();

        Dog dog1 = new Dog("Lu");
        dog1.greets();
        Dog dog2 = new Dog("Mic");
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Beo");
        bigDog1.greets();
        BigDog bigDog2 = new BigDog("Bon");
        bigDog1.greets(bigDog2);
        bigDog1.greets(dog1);
    }
}

package oop.lab05.ex1p5;

public class Test {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("Rabbit");
        System.out.println(mammal);

        Cat cat = new Cat("Cat01");
        System.out.println(cat);
        cat.greets();

        Dog dog = new Dog("Dog01");
        System.out.println(dog);
        dog.greets();
        Dog dog2 = new Dog("Dog02");
        dog.greets(dog2);
    }
}

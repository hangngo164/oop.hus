package oop.lab09.adapter.ex2;

public class RubberDuckAdapter implements Duck{
    private RubberDuck rubberDuck;

    public RubberDuckAdapter(RubberDuck rubberDuck) {
        this.rubberDuck = rubberDuck;
    }

    public void quack() {
        rubberDuck.squeak();
    }

    public void fly() {
        System.out.println("I can't fly.");
    }
}

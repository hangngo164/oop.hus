package oop.lab09.adapter.ex2;

public class AdapterPatterDemo {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        RubberDuck rubberDuck = new RubberDuck();
        Duck rubberAdapter = new RubberDuckAdapter(rubberDuck);

        System.out.println("MallardDuck says:");
        mallard.quack();
        mallard.fly();

        System.out.println("RubberDuckAdapter says:");
        rubberAdapter.quack();
        rubberAdapter.fly();
    }
}

package oop.lab09.strategy.ex3;

public class SortContext {
    private Sort strategy;

    public void setStrategy(Sort strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}

package oop.lab09.strategy.ex1;


public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    private static Order instance;

    private Order() {

    }

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
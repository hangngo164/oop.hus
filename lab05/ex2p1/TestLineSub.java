package oop.lab05.ex2p1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3 , 5);
        System.out.println(l1);
        Point begin = new Point(5, 6);
        l1.setBegin(begin);
        Point end = new Point(21, 12);
        l1.setEnd(end);
        System.out.println(l1);
    }
}

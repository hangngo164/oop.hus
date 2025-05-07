package oop.lab09.adapter.ex1;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }
    public int getRadius() {
        return (int) (Math.sqrt(2) / 2 * peg.getWidth());
    }
}

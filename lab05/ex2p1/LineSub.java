package oop.lab05.ex2p1;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public Point getBegin() {
        return this;
    }
    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return super.getX();
    }
    public void setBeginX(int beginX) {
        super.setX(beginX);
    }
    public int getBeginY() {
        return super.getY();
    }
    public void setBeginY(int beginY) {
        super.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }
    public int getEndX() {
        return super.getX();
    }
    public void setEndX(int endX) {
        super.setX(endX);
    }
    public int getEndY() {
        return super.getY();
    }
    public void setEndY(int endY) {
        super.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        super.setXY(endX, endY);
    }
    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString() {
        return "LineSub" + super.toString() + end;
    }
}

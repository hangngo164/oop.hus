package oop.lab08.ex1;

public class Dvd extends Item{
    int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Dvd[" + "duration=" + duration + super.toString();
    }
}

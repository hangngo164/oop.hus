package oop.lab08.ex1;

import java.util.Date;
public class Rent {
    Item item;
    Student student;
    Date begin;
    Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    public long getDiffDays(){
        return Math.abs(end.getTime() - begin.getTime()/1000/3600/24);
    }
    @Override
    public String toString() {
        return "Rent [item=" + item + ", student=" + student + ", begin=" + begin + ", end=" + end + "]";
    }
}

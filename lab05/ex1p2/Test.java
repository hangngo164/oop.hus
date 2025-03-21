package oop.lab05.ex1p2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Peter", "London", "primary", 2025, 10.5);
        System.out.println(student);

        Staff staff = new Staff("Linda", "America", " Harvard", 500.0);
        System.out.println(staff);
    }
}

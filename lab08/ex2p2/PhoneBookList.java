package oop.lab08.ex2p2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<Student>();
    }


    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook) {
            if (student != null && student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student != null && student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        if (student != null) {
            phoneBook.add(student);
        }
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student != null && student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        List<Student> removeStudents = new LinkedList<Student>();
        for (Student student : phoneBook) {
            if (student != null && student.getPhone().equals(phone)) {
                removeStudents.add(student);
            }
        }

        for (Student student : removeStudents) {
            phoneBook.remove(student);
        }
    }
}

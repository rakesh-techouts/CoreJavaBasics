package javabasics.assessment3;

import java.util.*;

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return " Student[name: " + name + " RollNum: " + rollNumber + "] ";
    }
}

public class _1CustomSorting {
    static void main() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Rakesh", 523));
        list.add(new Student("Vikas", 507));
        list.add(new Student("Eshwar", 510));
        list.add(new Student("Karthik", 553));

        Collections.sort(list, (stud1, stud2) -> stud1.rollNumber - stud2.rollNumber);
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}

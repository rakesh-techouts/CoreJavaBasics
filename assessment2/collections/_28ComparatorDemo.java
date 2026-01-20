package javabasics.assessment2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student that) {
        return this.age - that.age;
    }

    @Override
    public String toString() {
        return "[ Name: " + this.name + " age: " + this.age + " ]";
    }

}

public class _28ComparatorDemo {
    static void main() {
        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                else if (o1 % 10 == o2 % 10) {
                    if ((o1 / 10) % 10 > (o2 / 10) % 10)
                        return 1;
                    else
                        return -1;
                } else
                    return -1;
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(45);
        list.add(51);
        list.add(90);
        list.add(40);

        Collections.sort(list, com);
        System.out.println(list);


        /*
        Comparator<Student> comStud = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age){
                    return 1;
                }
                else
                    return -1;
            }
        };
        */
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Rakesh", 21));
        stud.add(new Student("Rakhi", 22));
        stud.add(new Student("Tanveer", 19));
        stud.add(new Student("Amena", 17));
        stud.add(new Student("Rak", 23));

        Collections.sort(stud);
        //Collections.sort(stud,comStud);
        System.out.println(stud);
    }
}
/*
    Both are Functional Interfaces

    Comparator:
        it is in java.util package
        it is an Interface which provide custom sorting externally without changing the Objects
        it has and method compare(<T> o1,<T> o2) Collections.sort(Collection<>,Comparator obj)
        cannot use for custom sorting
    Comparable :
        It is in java.lang
        it is also a FUnctionalInterface which is used for natural Ordering the objects Which
        implement the same class
        we can use a Single logic with-in the class itself
        it has compareTo(<T> o) compare the current object with another object of same type
 */
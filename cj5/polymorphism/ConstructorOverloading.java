package javabasics.cj5.polymorphism;


class Student {
    String name;
    int age;
    String course;

    // Constructor 1: No arguments
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // Constructor 2: One argument
    Student(String n) {
        name = n;
        age = 0;
        course = "Not Assigned";
    }

    // Constructor 3: Two arguments
    Student(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // Constructor 4: Three arguments
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rakesh");
        Student s3 = new Student("Vikas", 22);
        Student s4 = new Student("Rakesh", 22, "Java");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}

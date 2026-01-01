package javabasics.cj4.constructor;

// superclass Person
class Person {
    Person(int b)
    {
        System.out.println("Person class Constructor");
    }
}

// subclass Student extending the Person class
class Student extends Person {
    int a;
    int b;
    Student(int a, int b)
    {
        // invoke or call parent class constructor
        super(b);
        this.a=a;
        this.b=b;
        System.out.println(a+b);

        System.out.println("Student class Constructor");
    }
}

// Driver Program
class Constructor {
    public static void main(String[] args)
    {
        Student s = new Student(10,20);
    }
}

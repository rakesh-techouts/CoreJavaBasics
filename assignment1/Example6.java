package javabasics.assignment1;

class A {
    String name;
    int val;
    float f;

    A() {
        System.out.println("This is Default Constructor");
        this.name = null;
        this.val = 0;
        this.f = 0.0f;
    }

    A(String name, int val, float f) {
        System.out.println("This is Parameterised Constructor");
        this.name = name;
        this.val = val;
        this.f = f;
    }

    String displayValues() {
        return "Name: " + name + " Value: " + val + " Float: " + f;
    }
}

public class Example6 {
    public static void main(String[] args) {
        //Default constructor
        A obj = new A();
        System.out.println( obj.displayValues());

        //parameterized constructor
        A obj1 = new A("Rakesh", 523, 99.98f);
        System.out.println( obj1.displayValues());
    }
}

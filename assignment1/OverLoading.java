package javabasics.assignment1;

class Demo {
    void add() {
        System.out.println("This is Zero Parameterized method");
    }

    void add(int a, int b) {
        System.out.println("ADDITION(a+b): " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("ADDITION(a+b+c): " + (a + b + c));
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.add();
        d.add(10, 20);
        d.add(10, 20, 30);
    }
}

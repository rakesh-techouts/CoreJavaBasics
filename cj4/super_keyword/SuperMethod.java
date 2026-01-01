package javabasics.cj4.super_keyword;


class Super {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Sub extends Super {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }

    void greetBoth() {
        this.greet();
        super.greet();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.greetBoth();
    }
}

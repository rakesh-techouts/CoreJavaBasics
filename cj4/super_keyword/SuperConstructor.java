package javabasics.cj4.super_keyword;

class Base {
    Base() {
        System.out.println("Base() constructor");
    }
}

class Derived extends Base {
    Derived() {
        super(); // optional here; inserted implicitly by compiler
        System.out.println("Derived() constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

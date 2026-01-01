package javabasics.cj4.inheritance;

// Multilevel Inheritance Example
class Grandparent {
    void showGrandparent() {
        System.out.println("I am the Grandparent");
    }
}

class Parent2 extends Grandparent {
    void showParent() {
        System.out.println("I am the Parent");
    }
}

class Child2 extends Parent2 {
    void showChild() {
        System.out.println("I am the Child");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.showGrandparent();
        obj.showParent();
        obj.showChild();
    }
}

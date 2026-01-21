package javabasics.assessment3;

interface A {
    void show();

    default void display() {
        System.out.println("This is A Display");
    }
}

interface B {
    default void display() {
        System.out.println("This is B Display");
    }
}

class Helloo implements A, B {

    @Override
    public void show() {
        System.out.print("This is A Method");
    }

    @Override
    public void display() {
        A.super.display();//if we want to use B.super.display(); as same
    }
        /*
            if we want to use both
            write one method to call A.super.display();
            another for B.super.display();
         */
}

public class _13DefacultMethods {
    static void main() {
        Helloo h = new Helloo();
        h.display();
        h.show();
    }
}

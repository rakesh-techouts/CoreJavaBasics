package javabasics.cj8;
interface A{
    void show();
    default void display() {
        System.out.println("This is Display in A");
    }
}
interface B {
    void show();
    default void display() {
        System.out.println("This is Display in B");
    }
}
class Rama implements A,B{

    @Override
    public void show() {
        System.out.println("This is Show Method");
    }

    @Override
    public void display() {
        A.super.display();
        B.super.display();
    }
}
public class Default2 {
    static void main() {
        A obj = new Rama();
        obj.show();
        obj.display();
    }
}

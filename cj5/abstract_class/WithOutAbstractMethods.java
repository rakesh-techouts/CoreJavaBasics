package javabasics.cj5.abstract_class;

abstract class Demo {
     Demo() {
        System.out.println("This is Demo Constructor");
    }
    void display() {
        System.out.println("This is Display Method");
    }
    void show() {
        System.out.println("This is Show method");
    }
}
class Remo extends Demo {

}
public class WithOutAbstractMethods {
    public static void main(String[] args) {
        Demo d = new Remo();
        d.display();
        d.show();
    }
}

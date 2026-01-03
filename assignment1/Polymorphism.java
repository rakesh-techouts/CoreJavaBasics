package javabasics.assignment1;

class C {
    void display() {
        System.out.println("This is  method Display in C");
    }
     void show() {
        System.out.println("This is method Show in C");
    }
}
public class Polymorphism extends C {
    @Override
    void show() {
        System.out.println("This is Method show in Polymorphism");
    }
    public static void main(String[] args) {
        C obj=new Polymorphism();
        obj.display();
        obj.show();
    }
}

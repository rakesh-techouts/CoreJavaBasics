package javabasics.cj5.polymorphism;


class A{
    int a=10;
    static int b=10;
    static void show() {
        System.out.println("This is Class A Show");
    }
}
class B extends A{
    int a=20;
    static int b=20;
    static void show(){
        System.out.println("Thi is Class B Show");
    }
}
public class StaticBinging {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println("a: "+obj.a);
        System.out.println("b: "+obj.b);

        A a = new A();
        a.show();
        System.out.println("a: "+a.a);
        System.out.println("b: "+a.b);

        B b = new B();
        b.show();
        System.out.println("a: "+b.a);
        System.out.println("b: "+b.b);
    }
}

/*
 Initial variables , static methods and static variables access by reference type of the object
 */
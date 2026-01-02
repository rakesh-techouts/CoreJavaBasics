package javabasics.cj5.interface_examples;

interface A {
    void method1();
    void method2();
}

// B now includes method1 and method2
interface B extends A {
    void method3();
}

// the class must implement all method of A and B.
public class ExtendingMethods implements B {
    public void method1 () {System.out.println("Method 1");}
    public void method2 () {System.out.println("Method 2");}
    public void method3 () {System.out.println("Method 3");}
    public static void main(String[] args){

        ExtendingMethods x = new ExtendingMethods();

        x.method1();
        x.method2();
        x.method3();
    }
}
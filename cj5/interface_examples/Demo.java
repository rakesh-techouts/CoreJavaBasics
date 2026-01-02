package javabasics.cj5.interface_examples;


interface Marker {} // Marker interface

class MyClass implements Marker {}

public class Demo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        if (obj instanceof Marker) {
            System.out.println("This class is marked!");
        }
    }
}

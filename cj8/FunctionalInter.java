package javabasics.cj8;

import java.util.ArrayList;
import java.util.Collection;

public class FunctionalInter {
    static void main() {
        /*
            Functional interface is an interface
                contains exactly one abstract method.
                It can have any number of default or static methods, but only one abstract method.
                foundation for lambda expressions and method references
                @FunctionalInterface annotation is Optional but Recommended
         */

        Calculator add = (a, b) -> {
            return a + b;
        };
        Calculator subtract = (a, b) -> {
            return a - b;
        };
        Calculator multiply = (a, b) -> {
            return a * b;
        };
        Calculator divide = (a, b) -> {
            return (b == 0)? 0.0 :a / b;
        };
        System.out.println("a+b: "+add.calculate(10,20));
        System.out.println("a-b: "+subtract.calculate(10,20));
        System.out.println("a/b: "+divide.calculate(10,20));
        System.out.println("a/b and b==0: "+add.calculate(10,0));
        System.out.println("a*b: "+multiply.calculate(10,20));



        Hello h=()->{System.out.println("This is hello method implemented in another class");};
        h.hello();
        h.thu();

        ArrayList list = new ArrayList();

    }
}

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

@FunctionalInterface
interface Hello {
    static void show() {
        System.out.println("This is show method in Hello Interface");
    }
    static void display() {
        System.out.println("This is display method in Hello");
    }
    default void thu(){
        System.out.println("This is default method");
    }
    void hello();
}

interface Rakesh {
    static void show() {
        System.out.println("This is show method in Hello Interface");
    }
    static void display() {
        System.out.println("This is display method in Hello");
    }
    void show1();
    void show2();
}
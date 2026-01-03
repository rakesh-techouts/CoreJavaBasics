package javabasics.assignment1.packages.subpack3;

import javabasics.assignment1.packages.subpack1.Base;
import javabasics.assignment1.packages.subpack2.Derived;

public class Foreign {
    public static void main(String[] args) {
        // we're not in the same package or a subclass so we dont create objects for Base.
        // Base b = new Base(); //error

        // You can create Base using  public static factory method
        Base b = Base.create("ForeignBase");

        // b.name = "X";      // Compile error
        // b.greet();         // Compile error

        // What about a Derived instance?
        Derived d = new Derived();
        // Protected does not grant access just because the object is a subclass.
        // d.greet();         // Compile error
        // d.name = "Y";      // Compile error

        System.out.println("Foreign can only use public APIs of Base/Derived.");
    }
}

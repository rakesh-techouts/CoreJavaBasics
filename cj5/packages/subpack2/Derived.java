package javabasics.cj5.packages.subpack2;

import javabasics.cj5.packages.subpack1.Base;

public class Derived extends Base {
    public Derived() {
        super("Derived");                 // calling protected class constructor
    }

    public void work() {
        greet();                 // OK: inherited protected method
        System.out.println("Derived.name = " + name); // OK
    }

    public void tryAccessForeignBase() {
        Base other = Base.create("OtherBase");
        this.greet();
        super.greet();
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.work();
        d.tryAccessForeignBase();

        // Tricky: Accessing protected on a Derived reference is fine inside Derived,
        // but outside (another package, non-subclass) it won’t compile.
    }
}

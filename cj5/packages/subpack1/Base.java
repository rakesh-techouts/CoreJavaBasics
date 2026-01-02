package javabasics.cj5.packages.subpack1;

public class Base {
    protected String name ;// protected field
    protected void greet() {                   // protected method
        System.out.println("Hello from Base.greet(), name=" + name);
    }
    protected Base(String name) {                         // protected constructor
        this.name=name;
        System.out.println("Base() constructor");
    }

    // A public factory to create a Base
    public static Base create(String n) {
        return new Base(n);
    }
}

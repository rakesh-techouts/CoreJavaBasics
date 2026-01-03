package javabasics.assignment1;

class Base {
    static int m=10;
    int x=10;
    static void display() {
        System.out.println("Static method in Parent");
    }
}
class Derived extends Base {
    static int m=20;
    int x=20;
    static void display() {
        System.out.println("Static method in Child");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Base p = new Derived();
        System.out.println("By taking Base as Reference: ");
        p.display();
        System.out.println("X: "+p.x+" m: "+p.m);
        System.out.println("Base m: "+Base.m);
        System.out.println("Derived m: "+Derived.m);
        /*
         Output: Static method in Parent. it is totally based on the reference type not the type of object created
         if we want to use the Derived class static methods then we take the reference of Derived type
         for static ,methods , same instance variables, and static variables
         */
        Derived d = new Derived();
        System.out.println("By taking Derived as Reference: ");
        d.display();
        System.out.println("X: "+d.x+" m: "+d.m);
        System.out.println("Base m: "+Base.m);
        System.out.println("Derived m: "+Derived.m);
    }
}
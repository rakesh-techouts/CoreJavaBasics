
package javabasics.cj4.static_keyword;
/*
class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }
}
class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Parent p = new Child(); //reference type not object type
        p.display(); // Output: Static method in Parent
    }
}

*/
class Parent {
     void display() {
        System.out.println(" method in Parent");
    }
}
class Child extends Parent {
     void display() {
        System.out.println(" method in Child");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Parent p = new Child(); //reference type not object type
        p.display(); // Output: Static method in Parent
    }
}
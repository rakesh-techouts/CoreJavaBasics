package javabasics.cj4.inheritance;

// Superclass
class Animal {
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}
// Subclass
class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "Rohu";
        labrador.display(); // subclass method
        labrador.eat(); // inherited method
    }
}
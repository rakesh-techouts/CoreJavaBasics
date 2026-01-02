package javabasics.cj5.polymorphism;



class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // reference type: Animal, object type: Dog
        Animal a2 = new Cat(); // reference type: Animal, object type: Cat

        a1.speak(); // -> "Dog barks"
        a2.speak(); // -> "Cat meows"
    }
}

package javabasics.cj5.polymorphism;

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animals {
    @Override
    void sound() {
        System.out.println("Lion Sounds");
    }
}

class Rat extends Animals {
    @Override
    void sound() {
        System.out.println("Rat kiss kiss");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animals myAnimal; // Reference of type Animal

        myAnimal = new Lion(); //Type of lion
        myAnimal.sound();

        myAnimal = new Rat(); // type of rat
        myAnimal.sound();
    }
}

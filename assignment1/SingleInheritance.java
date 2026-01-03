package javabasics.assignment1;

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
        System.out.println("This is Vehicle constructor");
    }

    void start() {
        System.out.println(name + " is started");
    }

    void stop() {
        System.out.println(name + " is stopped");
    }

    void applyBreaks() {
        System.out.println("For bike " + name + " applied breaks");
    }
}

class Bike1 extends Vehicle {
    Bike1(String name) {
        super(name);
        System.out.println("This is Bike1 Class Constructor");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Bike1 b = new Bike1("Pulser");
        b.start();
        b.applyBreaks();
        b.stop();
    }
}

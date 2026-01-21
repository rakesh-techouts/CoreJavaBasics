package javabasics.cj8;

interface Vehicle {
    void start();

    void stop();

    void appliedBreaks();

    static void NumberOfWeels(int num) {
        System.out.println("This Vehicle has " + num + " wheels");
    }

    static void running() {
        System.out.println("Vehicle is running");
    }
    default void stopEngine() {
        System.out.println("Engine is Stopped");
    }
}

class Car implements Vehicle{
    String name;
    Car(String name) {
        this.name= name;
    }
    @Override
    public void start() {
        System.out.println(name+" Car is started");
    }

    @Override
    public void stop() {
        System.out.println(name+" Car is stopped...");
    }

    @Override
    public void appliedBreaks() {
        System.out.println(name+" Car applied breaks");
    }

     void engineStarted() {
        start();
        Vehicle.NumberOfWeels(4);
        Vehicle.running();
        appliedBreaks();
        stop();
    }
}


public class DefaultStatic {
    static void main() {
        Car c =  new Car("Benz");
        c.engineStarted();
        System.out.println();
        Car c1 = new Car("Shift");
        c1.engineStarted();
    }
}

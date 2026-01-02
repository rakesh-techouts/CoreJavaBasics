package javabasics.cj5.abstract_class;

abstract class Vehicle{
    Vehicle() {
        System.out.println("This is Vehicle Constructor");
    }
    abstract void run();
    abstract void applyBreak();
    abstract void speed();
    void display(){
        System.out.println("This is Vehicle Class");
    }
}

abstract class Bike1 extends Vehicle {
    Bike1() {
        System.out.println("This is Bike1 Constructor");
    }
    public void run() {
        System.out.println("Run method implemented in Bike1");
    }
}
abstract class Bike2 extends Bike1 {
    Bike2() {
        System.out.println("This is Bike2 Constructor");
    }
     public void applyBreak() {
        System.out.println("Apply Breaks method Implemented in Bike2");
    }
}
class Bike3 extends Bike2 {

    @Override
    void speed() {
        System.out.println("Speed method implemented in Bike3");
    }
}

public class AbstractVehicleMain {
    public static void main(String[] args) {
        Vehicle b3 = new Bike3();
        b3.speed();
        b3.applyBreak();
        b3.run();
        b3.display();
    }
}

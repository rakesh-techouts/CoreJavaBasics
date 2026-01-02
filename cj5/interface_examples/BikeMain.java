package javabasics.cj5.interface_examples;

class Bike implements Vehicle{
    String name="Pulser";
    @Override
    public void start() {
        System.out.println(name+ " is Started");
    }

    @Override
    public void stop() {
        System.out.println(name+" id Stopped");
    }

    @Override
    public void drive(int num) {
        System.out.println(name+ " is in Driving mode in Speed "+num+" MAT_SPEED: "+MAX_SPEED);
    }

    @Override
    public void display() {
        System.out.println("This is Bike display");
    }
}
public class BikeMain  {
    public static void main(String[] args) {
            Vehicle b = new Bike();
            b.start();
            b.drive(60);
            b.stop();
            b.display();
    }
}

package javabasics.cj5.interface_examples;

public interface Vehicle {
    void start();
    void stop();
    void drive(int i);
    int MAX_SPEED=100;
    default void display() {
        System.out.println("This is Default display");
    }
    static void staticMethod() {
        System.out.println("This is staticMethod");
    }
    private void privateMethod() {
        System.out.println("This is Private method");
    }
}

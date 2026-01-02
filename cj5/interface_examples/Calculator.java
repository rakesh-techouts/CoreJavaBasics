package javabasics.cj5.interface_examples;

@java.lang.FunctionalInterface
public interface Calculator {
    int compute(int x, int y);
    default void display() {
        run();
        System.out.println("This is default method in Functional Interface");
    }
    private  void run(){
        System.out.println("This is Private method in Functional Interface");
        show();
    }
    static void show() {
        System.out.println("This is show method in Functional Interface");
    }
}

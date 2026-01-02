package javabasics.cj5.interface_examples;

public class FunctionalInterface implements Calculator{
    @Override
    public int compute(int x, int y) {
        return x+y;
    }
    public static void main(String[] args) {
        Calculator cal = new FunctionalInterface();
        System.out.println( cal.compute(10,20));
        cal.display();

    }
}
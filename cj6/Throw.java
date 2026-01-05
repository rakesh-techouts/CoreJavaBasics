package javabasics.cj6;

public class Throw {
    public static void checkAge(int b) {
        if (b == 0) throw new ArithmeticException("this is not possible");
        int a = 10;
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            checkAge(0);
        } catch (ArithmeticException a) {
            System.out.println("Error!! " + a);
            System.out.println(a.getMessage());
        }
    }
}

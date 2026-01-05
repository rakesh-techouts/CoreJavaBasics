package javabasics.cj6;


public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("This is inner try starting");
                int a = 10 / 0; // This causes ArithmeticException
                System.out.println("This is Inner try ending");
            } catch (ArithmeticException e) {
                System.out.println("Inner catchBlock: " + e);
            } finally {
                System.out.println("This is inner finally");
            }
            String str = null;
            System.out.println(str.length()); // This is NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Outer catch Block: " + e);
        } finally {
            System.out.println("This is outer finally one executes always");
        }
    }
}
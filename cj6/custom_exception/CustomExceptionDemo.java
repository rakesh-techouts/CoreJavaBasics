package javabasics.cj6.custom_exception;


class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

/*
        if we want to create an exception must extends Exception class are its sub classes
        if you want to handle with checked exception then extends Exception class
        if you want to handle with unchecked exception then extends RuntimeException or Exception

        while we are writing the customs exceptions the Constructor is must implemented

 */
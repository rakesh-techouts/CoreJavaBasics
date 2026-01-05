package javabasics.cj6;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int a = sc.nextInt();
            System.out.println("Enter another Number: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.err.println("Error!! Divide by zero");
        }
    }
}

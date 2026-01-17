package javabasics.assessment2.exception;

import java.util.Scanner;

public class _1CheckedAndUnchecked {
    public static void division(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Error!");
        System.out.print("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Numerator: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Denominator: ");
            int num2 = sc.nextInt();
            division(num1, num2);
        } catch (ArithmeticException e) { // for unchecked ArithmeticException
            System.err.print(e.getMessage() + " Division by zero is not Possible");
        } catch (Exception e) { //for all Checked and unchecked
            throw new RuntimeException(e);
        }
    }
}
/*
    CheckedException:
           Compiler checks for the Exceptions at compile time it self.
           Give warning to programmer to Handle them
           without handling the program is not execute
           Ex: FileNotFoundException, InterruptedException , ClassNotFoundException

 */
package javabasics.assessment2.exception;

import java.util.Scanner;

public class _3TryCatchFinally {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Number of Elements: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " Elements Separated by spaces: ");
            for (int i = 0; i <= size; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Error! " + e);
        } catch (Exception e) {
            System.out.print("Error! " + e);
        } finally {
            sc.close();
            System.out.print("This is Finally block");
        }
    }
}
/*
    Program Execute from the main method and next create an object for Scanner class
    next enter in to the try block (try is a block of code to expect an Exception from that block)
    take input form the user for array size and create an array with that size and take input
    of elements from the user while taking

    the i<=size give an ArrayIndexOutOfBoundsException so it stop executing the try block
    and search for relevant catch block so ArrayIndexOutOfBoundsException catch block execute
    and then finally is to close connections and object to destroy

    if the i<size the no ArrayIndexOutOfBoundsException will occur then the program execute try block
    and go to finally block and close all connections and all

    Finally will execute irrespective of Exception Occurrence
 */
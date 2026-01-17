package javabasics.assessment2.exception;

import java.util.Scanner;

public class _5TryWithResource {
    static void main() {

        //try(resource1;
        //     resource2) {
        //    }
        try (Scanner sc = new Scanner(System.in)) {
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
        }
        /*
        finally {
            sc.close();
            System.out.print("This is Finally block");
        }
        no need to write this block and closing all connection manually is not required
        so when the Exception occur then automatically close the all connection and
        if not occur after the complication of try block the resource will close automatically
         */
    }
}

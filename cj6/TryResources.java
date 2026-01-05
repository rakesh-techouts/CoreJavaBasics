package javabasics.cj6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryResources {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num=sc.nextInt();
            System.out.println(num);
            /*
            Scanner object is terminated after the try block ended if any exception occurs
            then also it destroy
            no need to write sc.close();
             */
        }catch(InputMismatchException e) {
            System.err.println("Error! Please enter a Number"+e);
            //Error! Please enter a Numberjava.util.InputMismatchException
        }
    }
}

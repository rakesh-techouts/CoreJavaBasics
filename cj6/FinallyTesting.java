package javabasics.cj6;

import java.util.Scanner;

public class FinallyTesting {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("This is Try Starting...");
            System.out.println("Enter two numbers: ");
            int a=sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
            System.exit(0);
        }catch(Exception e) {
            System.err.println("Error! Divide ny Zero not possible");
            System.exit(0);
        }finally{
            System.out.println("This is finally block");
        }
    }
}

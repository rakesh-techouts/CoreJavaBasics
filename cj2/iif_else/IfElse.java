package javabasics.cj2.iif_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println("Its an Even Number");
        else System.out.println("Its an Odd Number");
    }
}

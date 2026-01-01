package javabasics.cj2.iif_else;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        if (a > 50) {
            System.out.println("It is Greater than 50");
        } else {
            if (a > 40) {
                System.out.println("It is Greater than 40 less than 50");
            } else {
                if (a > 30) {
                    System.out.println("It is Greater than 30 less than 40");
                } else {
                    System.out.println("It is Less than 30");
                }
            }
        }
    }
}

package javabasics.cj2.iif_else;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        if (a == 10) {
            System.out.println("It is Equal to 10");
        } else if (a == 20) {
            System.out.println("It is Equal to 20");
        } else if (a == 30) {
            System.out.println("It is Equal to 30");
        } else if (a == 40) {
            System.out.println("It is Equal to 40");
        } else {
            System.out.println("Invalid");
        }
    }
}

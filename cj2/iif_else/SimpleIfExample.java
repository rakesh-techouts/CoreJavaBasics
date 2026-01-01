package javabasics.cj2.iif_else;

import java.util.Scanner;
public class SimpleIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 50) {
            System.out.println("It is Greater than 50");
        }
    }
}

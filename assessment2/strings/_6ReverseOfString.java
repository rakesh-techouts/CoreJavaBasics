package javabasics.assessment2.strings;

import java.util.Scanner;

public class _6ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = sc.next();
        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev += str1.charAt(i);
        }
        System.out.print("Reverse of String: " + rev);
    }
}

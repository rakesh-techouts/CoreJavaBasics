package javabasics.assessment2.strings;

import java.util.Scanner;

public class _10NonRepeateFirst {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = sc.next().toLowerCase();
        for (char ch : str1.toCharArray()) {
            if (str1.indexOf(ch) == str1.lastIndexOf(ch)) {
                System.out.print("First Non-Repeating Character: " + ch);
                System.exit(0);
            }
        }
        System.out.print("No non-Repeat Characters");
    }
}

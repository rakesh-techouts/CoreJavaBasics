package javabasics.assessment2.strings;

import java.util.Arrays;
import java.util.Scanner;

public class _8AnaGrames {
    public static boolean isAnagrams(String st1, String st2) {
        if (st1.length() != st2.length()) return false;
        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String str1 = sc.next().toLowerCase();
        System.out.println("Enter the String2: ");
        String str2 = sc.next().toLowerCase();
        if (str1.equals(str2)) {
            System.out.println("Please enter different Strings");
            System.exit(0);
        }
        if (isAnagrams(str1, str2)) System.out.println(str1 + " and " + str2 + " are anagrams");
        else System.out.println(str1 + " and " + str2 + " are not anagrams");
    }
}

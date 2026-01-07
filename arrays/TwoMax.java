package javabasics.arrays;

import java.util.Scanner;

public class TwoMax {
    public static void findTwoMax(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2 && i != max1) {
                max2 = i;
            }
        }
        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the six values : ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        findTwoMax(arr);
    }
}

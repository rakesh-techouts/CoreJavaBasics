package javabasics.assessment2.arrays;

import java.util.Scanner;

public class _11SecondLargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements Separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        System.out.println("Second Largest Element is: " + max2);
    }
}

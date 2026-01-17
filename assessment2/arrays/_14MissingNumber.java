package javabasics.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _14MissingNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements Separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] != i) {
                System.out.print("Missing number is: " + i);
                System.exit(0);
            }
        }
        System.out.print("No missing Numbers");
    }
}

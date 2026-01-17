package javabasics.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _12RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {
        int size = arr.length;
        int count = 0;
        int[] org = new int[size];
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            boolean flag = false;
            for (int j = 0; j < count + 1; j++) {
                if (org[j] == num) {
                    flag = true;
                }
            }
            if (!flag) {
                org[count] = num;
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = org[i];
        }
        return array;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements Separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] org = removeDuplicates(arr);
        System.out.println("Before removing Duplicates: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After removing Duplicates: ");
        System.out.println(Arrays.toString(org));
    }
}

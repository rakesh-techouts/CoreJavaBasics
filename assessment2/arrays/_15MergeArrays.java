package javabasics.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _15MergeArrays {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in Array1 and Array2: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter " + size1 + " Elements Separated by spaces: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " Elements Separated by spaces: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] org = new int[size1 + size2];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        for (int i = 0; i < size1; i++) {
            org[count] = arr1[i];
            count++;
        }
        for (int i = 0; i < size2; i++) {
            org[count] = arr2[i];
            count++;
        }

        Arrays.sort(org);
        System.out.println(Arrays.toString(org));
    }
}

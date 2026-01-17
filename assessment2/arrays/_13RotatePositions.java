package javabasics.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _13RotatePositions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter " + size + " Elements Separated by spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number of Positions to rotate");
        int n= sc.nextInt();
        int[] org =new int[size];
        int count=0;
        for(int i=n;i<size;i++) {
            org[count]=arr[i];
            count++;
        }
        for(int i=0;i<n;i++){
            org[count]=arr[i];
            count++;
        }
        System.out.println(Arrays.toString(org));
    }
}

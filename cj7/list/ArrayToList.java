package javabasics.cj7.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 60};
        List<Integer> l1 = Arrays.asList(arr);
        System.out.println(l1);


        int[] arr1 = {1, 2, 3, 4, 5, 6};
        //List<Integer> l2 = Arrays.asList(arr1);
        // it does not work because these are working with Wrapper class only
        List<Integer> l2 = new ArrayList<>();
        for (int i : arr1) {
            l2.add(i);
        }
        System.out.println(l2);
    }
}

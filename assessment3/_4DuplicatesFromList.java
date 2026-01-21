package javabasics.assessment3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4DuplicatesFromList {
    static void main() {
        Integer[] arr = new Integer[]{10, 22, 22, 40, 40, 60, 70, 8, 9, 9};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        List<Integer> l = list.stream().distinct().toList();
        System.out.println(l);
    }
}

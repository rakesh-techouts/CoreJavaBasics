package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class _6ListToSquares {
    static void main() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        List<Integer> l = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(l);
    }
}

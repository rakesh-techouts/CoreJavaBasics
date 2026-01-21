package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5CountOfElement {
    static void main() {
        Integer[] arr = new Integer[]{10, 29, 30, 39, 20, 40, 50, 1, 10, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        long count = list.stream().filter(n -> n % 5 == 0).count();
        System.out.println("There are " + count + " elements are divisible by 5 in ArrayList");
    }
}

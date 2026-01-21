package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18AllMatch {
    static void main() {
        Integer[] arr = new Integer[]{11, 20, 11, 3, 4, 50, 46, 20, 80, 4, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        if (list.stream().allMatch(i -> i % 2 == 0)) {
            System.out.println("All Elements are Even");
        } else {
            System.out.println("Mixture of Even and Odd Numbers");
        }
    }
}

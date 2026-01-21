package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _7MaxMin {
    static void main() {
        Integer[] arr = new Integer[]{1, 20, 3, 4, 50, 46, 78, 80, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min = list.stream().min(Integer::compareTo);

        System.out.println("Maximum: " + max);
        System.out.println("Minimun: " + min);
    }
}

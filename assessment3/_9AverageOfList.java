package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _9AverageOfList {
    static void main() {
        Integer[] arr = new Integer[]{11, 20, 11, 3, 4, 50, 46, 20, 80, 4, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Double d = list.stream().collect(Collectors.averagingDouble(i -> i.intValue()));
        System.out.println("AverageOf: " + d);
    }
}

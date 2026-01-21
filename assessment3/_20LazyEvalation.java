package javabasics.assessment3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _20LazyEvalation {
    static void main() {
        Integer[] arr = new Integer[]{11, 20, 11, 3, 4, 50, 46, 20, 80, 4, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        int num=list.stream().filter(i-> {
                    System.out.println("Element entered: "+i);
                    return i % 10 == 0;
                })
                .map(n->n*n).findFirst().orElse(-1);
        System.out.println(num);
    }
}

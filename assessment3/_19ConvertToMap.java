package javabasics.assessment3;

import java.util.*;
import java.util.stream.Collectors;

public class _19ConvertToMap {
    static void main() {
        Integer[] arr = new Integer[]{11,20,11,3,4,50,46,20,80,4,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(n->n,n->n%2,(i,j)->i));
        System.out.println(map);
    }
}

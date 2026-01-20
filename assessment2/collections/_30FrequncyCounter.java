package javabasics.assessment2.collections;

import java.util.*;

public class _30FrequncyCounter {
    static void main() {
        Integer[] arr = {10,20,30,10,20,40};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i:list) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println(map);
    }
}

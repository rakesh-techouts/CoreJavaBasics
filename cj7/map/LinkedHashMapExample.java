package javabasics.cj7.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        /*
            LinkedHashMap follows the insertion order
            it has single null key
            but with multiple null values

         */
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=1;i<10;i++) {
            map.put(i,100*i);
        }
        System.out.println(map);
        map.put(15,20);
        System.out.println(map);
        map.putFirst(23,9);
        map.putLast(52,64);
        map.put(null,40);
        map.put(null,50);
        map.put(10,null);
        map.put(11,null);
        System.out.println(map);


        if(map.containsKey(null)){
            map.remove(null);
        }


        System.out.println();
        // Iterating over keys and values
        System.out.println("Iteration using Entry entryset(): ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("Iteration using Iterator: ");
        Iterator<Integer> itrKey = map.keySet().iterator();
        Iterator<Integer> itrValue = map.values().iterator();
        while(itrKey.hasNext() && itrValue.hasNext()) {
            System.out.println(itrKey.next()+" ---> "+ itrValue.next());
        }
    }
}

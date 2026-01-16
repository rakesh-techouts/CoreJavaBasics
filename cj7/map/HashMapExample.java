package javabasics.cj7.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        /*
                HashMap allows the multiple null values
                but single null key
                HashMap not synchronised but we can make it externally
                Collections.synchronisedMap();
                it does not follow the insertion order
                it does not follow the sorted order
         */
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Updating a value
        map.put("Apple", 60); // Overwrites old value

        // getting value by key
        System.out.println("Price of Apple: " + map.get("Apple"));

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is available."+map.get("Banana"));
        }

        // Iterating over keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        Iterator<String> itrKey = map.keySet().iterator();
        Iterator<Integer> itrValue = map.values().iterator();
        while(itrKey.hasNext() && itrValue.hasNext()) {
            System.out.println(itrKey.next()+" ---> "+ itrValue.next());
        }


        System.out.println("Keys in Map: "+map.keySet());
        System.out.println("Values in Map: "+map.values());

        map.put("PineAplle",null);
        map.put("rakesh",null);
        map.put(null,50);
        map.put(null,70);//update null vale with 70
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("Size of Map: "+map.size());

        if(map.containsKey("rakesh"))
            map.remove("rakesh");


        System.out.println("Map after removing rakesh: "+map);

    }
}

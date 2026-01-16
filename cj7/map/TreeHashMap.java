package javabasics.cj7.map;

import java.util.TreeMap;

public class TreeHashMap {
    public static void main(String[] args) {
        /*
            implements NavigableMap(I) which extends SortedMap(I) which extends Map(I)
            follows Sorted order keys not values and we can give manual sorting conditions
            it does not allow null key(it throws NullPointerException)
            but it allows multiple null values
         */
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"Rakesh");
        map.put(9,"Vikas");
        map.put(6,"Karthik");
        map.put(20,"Manoj");
        map.put(8,"Ajay");
        System.out.println(map);
        System.out.println("SIze of the Map: "+map.size());

        TreeMap<Integer, String> m = new TreeMap<>();

        m.put(10, "run");
        m.put(20, "Fun");
        m.put(30, "Gun");

        //adding merge the map
        map.putAll(m);
        System.out.println(map);

        /*
        this block shows RunTimeError NullPointerException
        map.put(null,"Raghu");
        map.put(null,"Ram");
        */
        map.put(11,null);
        map.put(12,null);
        System.out.println(map);


    }
}

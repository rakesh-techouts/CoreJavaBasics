package javabasics.assessment2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _27SortHashMapByValues {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rakesh",10);
        map.put("Vikas",12);
        map.put("Rakhi",5);
        map.put("Rak",45);
        map.put("sunny",37);
        map.put("bunny",100);
        System.out.println(map);

        Map.Entry.comparingByValue();
        System.out.println(map);
    }
}

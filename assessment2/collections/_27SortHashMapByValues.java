package javabasics.assessment2.collections;

import java.util.*;

public class _27SortHashMapByValues {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rakesh",10);
        map.put("Vikas",10);
        map.put("Rakhi",5);
        map.put("Rak",45);
        map.put("sunny",37);
        map.put("bunny",100);
        System.out.println(map);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for(Map.Entry<String,Integer> l: list) {
            System.out.println(l.getKey()+ "   "+l.getValue());
        }
    }
}

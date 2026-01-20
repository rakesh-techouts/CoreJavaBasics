package javabasics.assessment2.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class _29FailSafeItr {
    public static void main(String[] args)
    {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));
            map.put("TEN",6);
        }
    }
}

/*
        if we try to add or remove elements from the collection while iterating it gives an ConcurrentModificationException
        using Enumeration we can traverse cant't do any operations while iteration
        if we use iterator we can remove() elements but other operations
        ListIterator is used for traverse both directions and can remove and add elements while removing

        if we use ConcurrentHashMap it does not give any Exception and we can 
 */
package javabasics.cj7.set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        //we can give capacity for the HashSet if not give it default 16
        //Increase the size by 2X
        //internally it uses HashMap for building hash table
        //add()
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(30);//duplicate treat as single
        h1.add(40);
        //size()
        System.out.println(h1.size());
        System.out.println(h1);//does not follow any order

        //we can add null but only one null
        h1.add(null);
        h1.add(null);
        System.out.println(h1);//null print first

        //contains()
        if(h1.contains(10)) {
            //remove()
            h1.remove(10);
        }
        System.out.println("After Removing 10: "+h1);

        HashSet<Integer> h2=h1;
        System.out.println("Without Clone Before update h1: "+h1);
        System.out.println("Without Clone Before update h2: "+h2);
        h1.add(100);
        System.out.println("Without Clone After update h1: "+h1);//updated
        System.out.println("Without Clone After update h2: "+h2);//updated

        HashSet<Integer> h3 = (HashSet<Integer>) h1.clone();
        System.out.println("With Clone Before update h1: "+h1);
        System.out.println("With Clone Before update h3: "+h3);
        h1.remove(100);
        System.out.println("With Clone After update h1: "+h1);
        System.out.println("With Clone After update h2: "+h2);
        System.out.println("With Clone After update h3: "+h3);//not update in h3

        HashSet<Integer> h4 = new HashSet<>();
        h4.add(1);
        h4.add(2);
        h1.addAll(h4);
        System.out.println(h1);

        //Iteration
        System.out.println("Working with Enumeration: ");
        Enumeration<Integer> enumeration= Collections.enumeration(h1);
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement());
        }
        System.out.println();
        System.out.println("Working with Iterator: ");
        Iterator<Integer> itr = h1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        System.out.println("working with enhanced For: ");
        for(Integer i:h1) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}

package javabasics.cj7.set;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("Rakesh");
        list.add("vikas");
        list.add("Eshwar");
        list.add("Karthik");
        list.add("Ajay");
        list.add(null);
        System.out.println(list);

        list.addFirst("Chinna");
        list.addLast("chinni");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);



        System.out.println("Working with Enumeration: ");
        Enumeration<String> enumeration= Collections.enumeration(list);
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement());
        }
        System.out.println();
        System.out.println("Working with Iterator: ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //contains() remove()
        if(list.contains(null)) {
            list.remove(null);
        }
        System.out.println("After Removing: "+list);


        LinkedHashSet<String> list1= new LinkedHashSet<>();
        list1.add("Prabhas");
        list1.add("Rakesh");
        list1.add("vikas");
        list1.add("nani");
        System.out.println(list.retainAll(list1));

        System.out.println(list);
        System.out.println(list1);
    }
}

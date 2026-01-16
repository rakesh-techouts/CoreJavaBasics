package javabasics.cj7.set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> tree= new TreeSet<>();
        tree.add(23);
        tree.add(9);
        tree.add(11);
        tree.add(100);
        tree.add(8);
        tree.add(17);
        System.out.println(tree);

        System.out.println(tree.lower(17));
        //print highest among the lowest  elements to the given element
        System.out.println(tree.higher(45));
        //print lowest among the highest elements to the given element

        //Iteration of elements
        System.out.println("Working with Enumeration: ");
        Enumeration<Integer> enumeration= Collections.enumeration(tree);
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement());
        }
        System.out.println();
        System.out.println("Working with Iterator: ");
        Iterator<Integer> itr = tree.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //contains() remove()
        if(tree.contains(9)) {
            tree.remove(17);
        }
        System.out.println("After Removing: "+tree);

        List<Integer> list =new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(22);
        tree.addAll(list);
        System.out.println("Adding the List to tree: "+tree); //remove all duplicates and print in sorted order

        //if the element exists in tree it return that value only
        //if not it will return next greater value present in tree
        System.out.println(tree.ceiling(20));

        //if the element exists in tree it return that value only
        //if not it will return next lowest value present in tree
        System.out.println(tree.floor(90));


        //same as getFirst()
        System.out.println(tree.first());
        System.out.println(tree.last());
        //getFirst() getLast()
        System.out.println("First Element: "+tree.getFirst());
        System.out.println("Last Element: "+tree.getLast());

        //return and remove
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        //tree.add(null); not aspect the null values
        System.out.println(tree);
        //tree.add(null);
    }
}


/*
        these is in Sorted format
        it implements the NavigableSet which extends SequentialSet(I) which extends Set(I)
        addFirst(), addLast(), add(null) these does not give any compile time errors but give runtime errors
        these are not usable methods in TreeSet
 */
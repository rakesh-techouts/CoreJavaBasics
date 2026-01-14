package javabasics.cj7.list;

import java.util.*;

public class VectorExample {
    public static void main(String args[]) {

        Vector<Integer> vc = new Vector<>();
        System.out.println("Initial Capacity: "+vc.capacity());//10
        vc.add(100);
        vc.add(200);
        vc.add(300);
        vc.add(200);
        vc.add(400);
        vc.add(500);
        vc.add(600);
        vc.add(200);
        vc.add(700);
        System.out.println("Values in vector: " + vc);


        //use remove()
        System.out.println("Remove first occurrence of element 200: " + vc.remove((Integer) 200));
        System.out.println("Values in vector: " + vc);


        //Remove the element at index 4
        System.out.println("Remove element at index 4: " + vc.remove(4));
        System.out.println("New Value list in vector: " + vc);


        //Remove  element
        vc.removeElementAt(5);


        System.out.println("Vector element after removal: " + vc);

        System.out.println("Hash code of this vector = " + vc.hashCode());

        System.out.println("Element at index 1 is = " + vc.get(1));
        System.out.println("Element at First: " + vc.getFirst());
        System.out.println("Element at Last: " + vc.getLast());

        System.out.println("Working with Iterator: ");
        Iterator<Integer> itr = vc.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("Working with Enumeration: ");
        Enumeration<Integer> enumeration=vc.elements();
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }
        System.out.println();


        Vector<Integer> v1= new Vector<>(2);
        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println(v1.capacity());//4
        System.out.println(v1.size());
    }
}
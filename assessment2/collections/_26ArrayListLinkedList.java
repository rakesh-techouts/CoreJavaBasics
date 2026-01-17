package javabasics.assessment2.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _26ArrayListLinkedList {
    static void main() {
        ArrayList<Integer> list1= new ArrayList<>();


        list1.add(10);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(30);
        System.out.println(list1);
        list1.removeFirst();
        list1.removeLast();
        list1.addFirst(1);
        list1.addLast(100);
        System.out.println(list1);

        if(list1.contains(50)){
            list1.remove((Integer) 50);
        }
        System.out.println(list1.get(1));
        /*
           The program and methods in both are similar but their implementation and performance is varies
           ArrayList
                it is Dynamic Array increased by 0.5x of old size
                accessing the random element is easy
                not suitable for insertion and deletion at specific place
                swaping and take time for these operations
           LinkedList
                internally it uses Double-LinkedList
                accessing of random elements is take some time compare to Arraylist
                very suitable for insertion , deletion
                no need to swap
         */
        LinkedList<Integer> list2= new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        System.out.println(list2);
        list2.addFirst(1);
        list2.addLast(100);
        list2.remove(3);
        list2.removeFirst();
        list2.removeLast();
        if(list2.contains(50)){
            list2.remove((Integer)50);
        }
        System.out.println(list2.get(1));

    }
}

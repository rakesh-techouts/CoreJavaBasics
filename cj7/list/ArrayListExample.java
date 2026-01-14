package javabasics.cj7.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //add method add the element at last of the ArrayList(insert)
        list.add("Rakesh");
        list.add("Vikas");
        list.add("Ganesh");
        list.add("Manoj");
        System.out.println(list);

        //insert at specific place
        list.add(0, "Tanveer");
        System.out.println(list);

        //update using index
        list.set(1, "Rakhi");
        System.out.println(list);

        //getting the specific index element
        System.out.println(list.get(1));

        //iteration of elements
        for (String str : list) {
            System.out.print(str + " ");
        }

        System.out.println();
        Iterator<String> itr= list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        /*
            System.out.println("Working with Enumeration");
            Enumeration not work for the ArrayList
        */
        list.addFirst("Ram Ram");
        list.addLast("Hello");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        List<String> list2 = new ArrayList<>();
        list2.add("techouts");
        list2.add("wipro");
        list2.add("infosys");

        //adding all elements of another collection at last
        list.addAll(list2); //list.addAll(1,list2); at specific index
        System.out.println(list);

        //Collections.sort();
        Collections.sort(list);
        System.out.println("Sorted List:  " + list);

        //return subList
        System.out.println(list.subList(0, 4));//starting index ,endingIndex+1

        System.out.println("Size of the ArrayList: " + list.size());


        System.out.println(list);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);

    }
}

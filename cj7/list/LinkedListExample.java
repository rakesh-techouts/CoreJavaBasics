package javabasics.cj7.list;


import java.util.*;


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> actors = new LinkedList<>();
        System.out.println(actors.peekFirst());
        //add method
        actors.add("NTR");
        actors.add("Balakrishna");
        actors.add("Ram Charan");
        actors.add("Allu Arjun");
        System.out.println(actors);

        //addFirst() addlast() add(index,element)
        actors.addFirst("Prabhas");
        actors.addLast("Sampu");
        actors.add(1, "Gopi");

        System.out.println(actors);


        //addAll and addAll(index)
        List<String> l1 = List.of("nagarjuna", "Nani", "Ravi Teja");
        actors.addAll(l1);
        actors.addAll(2, List.of("Sai Dharam Tej", "Vijay Deverakonda"));
        System.out.println(actors);

        //peek methods just print the elements
        String peekHead = actors.peek(); //head of the List mostlyFirst
        String peekFirst = actors.peekFirst();//First element
        String peekLast = actors.peekLast();//Last Element
        System.out.println(peekHead + " " + peekFirst + " " + peekLast);
        System.out.println("After peek operations" + actors);

        //pool print and delete the elements
        String polled = actors.poll();            // remove head and Gopi become Head
        String polledFirst = actors.pollFirst();  // remove head
        String polledLast = actors.pollLast();    // remove tail
        System.out.printf("poll()=%s, pollFirst()=%s, pollLast()=%s%n", polled, polledFirst, polledLast);
        System.out.println("After poll operations" + actors);


        actors.push("Suman");                 // push to front of List
        System.out.println("After the pushing the Suman: " + actors);
        actors.pop();                            // pop from front of List
        System.out.println("After pop: " + actors);
        System.out.println("List now" + actors);

        //get operations
        String first = actors.getFirst();
        String last = actors.getLast();
        String index = actors.get(3);
        System.out.printf("getFirst()=%s, getLast()=%s, get(3)=%s%n", first, last, index);


        System.out.println("For-each :");
        for (String a : actors)
            System.out.println("  " + a);

        System.out.println("Iterator :");
        Iterator<String> it = actors.iterator();
        while (it.hasNext())
            System.out.println("  " + it.next());

        System.out.println("Descending iterator (reverse):");
        Iterator<String> dit = actors.descendingIterator();
        while (dit.hasNext()) System.out.println("  " + dit.next());



    }
}

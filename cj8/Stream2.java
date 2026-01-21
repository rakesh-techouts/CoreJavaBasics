package javabasics.cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    static void main() {
        List<Integer> list=new ArrayList<>(Arrays.asList(32,45,6,7,12,87,30,21,90,100));
        //filter() is intermediate operation in stream
        //to print the element which divided by 3
        list.stream().filter(i->i%3==0).forEach(i-> System.out.print(i+" "));
        System.out.println();

        List<Integer> arr=list.stream().filter(i->i%3==0).collect(Collectors.toList());
        System.out.println(arr);

        list.stream().filter(i->i>10)// to filter the elements based on the condition
                .map(n->n/2) //apply for the all elements in the list
                .sorted()//sort th elements
                .forEach(n->System.out.print(n+" ")); //print th elements


    }
}

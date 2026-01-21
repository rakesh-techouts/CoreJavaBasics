package javabasics.cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    static void main() {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Stream<Integer> st1 = Arrays.stream(new Integer[]{10,20,30,40,50});
        Stream<Integer> st2 = list.stream();
        Stream<String> st3 = Stream.of("Rakesh","Rak","Rakhi","Rake");
        Stream<Float> st4 = Stream.empty();
        List<Integer> st5= Stream.iterate(1,n->n+1).limit(10).collect(Collectors.toList());
        System.out.println();

        System.out.println(st5);
        st1.forEach(i->System.out.print(i+" "));
        System.out.println();
        st2.forEach(i->System.out.print(i+" "));
        System.out.println();
        st3.forEach(i->System.out.print(i+" "));
        System.out.println();
        st4.forEach(i->System.out.print(i+" "));
        System.out.println();
    }
}

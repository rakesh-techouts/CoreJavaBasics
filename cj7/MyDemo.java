package javabasics.cj7;

import java.util.ArrayList;
import java.util.Vector;

public class MyDemo {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(3);
        System.out.println(list.size());

        Vector<Integer> vc = new Vector<>(8);
        System.out.println(vc.capacity());
        vc.add(10);
        vc.add(11);
        System.out.println(vc.capacity());
        vc.add(12);
        System.out.println(vc.capacity());

        for(int i=0;i<15;i++) {
            vc.add(i);
            System.out.println(vc.capacity());
        }
    }
}

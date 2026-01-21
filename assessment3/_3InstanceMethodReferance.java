package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Techouts {
    void show(Integer i) {
        System.out.println(i);
    }
}

public class _3InstanceMethodReferance {
    static void main() {
        Techouts techOuts = new Techouts();
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.forEach(techOuts::show);
    }
}

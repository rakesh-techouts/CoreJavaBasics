package javabasics.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _8ListOfListString {
    static void main() {
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList("Rakesh", "Rak", "Rakhi", "Rakesh")));
        list.add(new ArrayList<>(Arrays.asList("Rakesh", "Rakhi", "Rakhi", "Rakesh")));
        list.add(new ArrayList<>(Arrays.asList("Rakesh", "Rak", "Rakhi", "Rakesh")));

        List<String> l = list.stream().flatMap(List::stream).distinct().collect(Collectors.toList());

        System.out.println(l);
    }
}

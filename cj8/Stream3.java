package javabasics.cj8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
    static void main() {
        String[] myArray = new String[]{"madam", "please", "refer", "link", "on", "racecar"};
        Arrays.stream(myArray).filter(Stream3::isPalindrome).forEach(i -> System.out.print(i + " "));

        Integer[] arr = new Integer[]{10, 20, 30, 8, 40, 2, 3, 4, 200, 100};

        List<Integer> list=Arrays.stream(arr).distinct().sorted().collect(Collectors.toList());
        System.out.println("Second Largest: "+list.get(list.size()-2));
        System.out.println("Second Smallest: "+list.get(1));


        System.out.println(Arrays.stream(arr).sorted().skip(1).findFirst());
        System.out.println(Arrays.stream(arr).sorted(Comparator.reverseOrder()).skip(1).max(Integer::compareTo));
    }
}

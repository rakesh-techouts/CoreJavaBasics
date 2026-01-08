package javabasics.string;
import java.util.StringTokenizer;
public class StringToken {
    public static void main(String[] args) {
        // String , " " delimiter
        StringTokenizer s = new StringTokenizer("Hi rakesh How Are You"," ");

        System.out.println(s.toString()); //java.util.StringTokenizer@65ab7765


        System.out.println("Tokens using hasMoreElements");
        while(s.hasMoreElements()) {
            System.out.println(s.nextElement());
        }
        //to traverse
        System.out.println();
        System.out.println("Tokens using hasMoreTokens");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        System.out.println(s.toString());


        //alternative for StringTokenizer String.split("");
        String str = new String("hi rakesh how are you");
        String[] ar=str.split(" ");

        for(String s1: ar) {
            System.out.println(s1);
        }
    }
}

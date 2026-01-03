package javabasics.assignment1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ForLoop Print even Numbers
        System.out.println("FOR Loop");
        for(int i=0;i<20;i++){
            if(i%2 !=0)
                continue;
            System.out.println(i);
            if(i==10)
                break;
        }
        System.out.println("WHILE Loop");
        int num= 1234;
        int rev=0;
        while(num>0) {
            rev=rev*10+(num%10);
            num/=10;
        }
        System.out.println("Reverse: "+rev);


        System.out.println("DO WHILE Loop");
        //printing hello until exit
        do{
            System.out.println("Hello java");
            System.out.printf("1.Print %n2.Exit %n");
        }while(sc.nextInt() != 2);
    }
}

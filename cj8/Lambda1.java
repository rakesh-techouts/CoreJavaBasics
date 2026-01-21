package javabasics.cj8;

@FunctionalInterface
interface Sum{
    void add(int a,int b);
}

public class Lambda1 {

    public static void main(String[] args) {
        /*
                Lambda Expression uses for only Functional interface
                which give code as a parameter
                Functional Interface must have with only single abstract method
         */
        Runnable r = () -> System.out.println("Hello World");
        new Thread(r).start();

        /*Thread t1 = new Thread(() -> {
            System.out.print("Printing Numbers from 0 to 10: ");
            for(int i=0;i<=10; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        });
        t1.start();*/


        Sum s=( a, b)-> System.out.println("a +b: "+(a+b));

        s.add(10,20);
    }
}

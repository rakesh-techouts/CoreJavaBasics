package javabasics.files.basics;

public class ByteToString {
    public static void main(String[] args) {
        String str = new String("This is my Life");

        byte[] bytes = str.getBytes();
        for(byte b:bytes) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(new String(bytes));
    }
}

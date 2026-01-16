package javabasics.files.write_files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        byte[] arr = {82,65, 75, 69, 83, 72}; //RAKESH

       ByteArrayInputStream bai = new ByteArrayInputStream(arr);
        System.out.println(bai.available()); // tells how many elements in the ByteArrayInputStream


        System.out.println((char)bai.read()); //R
        System.out.println((char)bai.read()); //A
        System.out.println( bai.skip(2));//Skip K E


        System.out.println((char) bai.read());// S

        bai.mark(2);
        System.out.println((char)bai.read());//H

        System.out.println(bai.available());//0*/



        byte[] arr1 = {71,72,73,74,75,76};
        ByteArrayInputStream by2 = new ByteArrayInputStream(arr1);
        byte[] arr2={81,82,83,84,85,86};

        System.out.println(by2.read(arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[5]=80;//effects on both
        arr2[5]=90;//does not effects any one of array
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}

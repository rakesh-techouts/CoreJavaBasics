package javabasics.cj6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
        //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

//        int num[] = {1, 2, 3, 4};
//        System.out.println(num[5]); //un checked exception ignored at compilation time but occurs at rum time
    }
}
//read() and close() methods throws an IOExceptions and programmer must handled it
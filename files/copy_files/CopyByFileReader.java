package javabasics.files.copy_files;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyByFileReader {
    public static void main(String[] args) throws IOException {
        try(FileReader fr = new FileReader("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\MultiplicationTable.java");
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\Multiplication.txt")){
            int ch;
            while((ch= fr.read())!=-1) {
                fout.write(ch);
            }
        }catch (Exception e) {
            System.err.println("Something went Wrong"+e);
        }
    }
}

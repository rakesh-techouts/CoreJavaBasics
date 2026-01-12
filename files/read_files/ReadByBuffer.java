package javabasics.files.read_files;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByBuffer {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\File.txt");
            BufferedReader br =  new BufferedReader(fr)) {
            while(br.readLine()!=null) {
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
    }
}

package javabasics.files.write_files;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteByConsole {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        try(FileWriter fw = new FileWriter("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\write_files\\Demo.txt");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the data after Completing write end in new line");
            while(true) {
                String str = be.readLine();
                if(str.equalsIgnoreCase("END")) break;
                sb.append(str);
                sb.append(System.lineSeparator());
            }
            fw.write(sb.toString());
        }catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

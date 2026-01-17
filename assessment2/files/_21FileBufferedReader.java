package javabasics.assessment2.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _21FileBufferedReader {
    static void main() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File1");
        try (BufferedReader br = new BufferedReader(reader)) {
            String line = "";
            while ((line = br.readLine()) != null) {
                //here the line is read from file and store in String line and then checking
                //if it is null or not if not null print that line if null exit the loop
                System.out.println(line);
            }
        }
    }
}



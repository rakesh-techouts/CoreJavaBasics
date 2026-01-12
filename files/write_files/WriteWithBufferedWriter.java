package javabasics.files.write_files;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WriteWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        try (FileWriter f1 = new FileWriter("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\FileWriteBuffer.java");
             BufferedWriter bw = new BufferedWriter(f1);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your text to write in File: ");
            String str = br.readLine();
            bw.write(str);
        } catch (Exception e) {
            System.err.println("Something went Wrong");
        }
    }
}


//
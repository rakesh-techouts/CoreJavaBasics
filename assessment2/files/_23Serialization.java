package javabasics.assessment2.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("My Name is: " + name + " of RollNumber: " + rollNumber);
    }
}

public class _23Serialization implements Serializable {
    static void main() {
        //Serialization
        Student s1 = new Student("Rakesh", 523);
        Student s2 = new Student("Rakhi", 2858);
        Student s3 = new Student("Chinna", 134);
        //ObjectOutputStream and writeObject() is used to write the objects in the files
        //ObjectInputStream and readObject()
        try (FileOutputStream fout = new FileOutputStream("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File3.txt");
             ObjectOutputStream objOut = new ObjectOutputStream(fout)) {
            objOut.writeObject(s1);
            objOut.writeObject(s2);
            objOut.writeObject(s3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Student> list = new ArrayList<>();
        //DeSerialization
        try (FileInputStream fin = new FileInputStream("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File3.txt");
             ObjectInputStream objIn = new ObjectInputStream(fin)) {
            Student stud;
            while ((stud = (Student) objIn.readObject()) != null) {
                list.add(stud);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Student s : list) {
            s.display();
        }
    }
}

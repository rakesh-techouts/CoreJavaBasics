package javabasics.assignment1;

import java.util.ArrayList;

class School{
    String name;
    ArrayList<Student> stud;
    School(String name,ArrayList<Student> stud){
        this.name=name;
        this.stud=stud;
    }
    ArrayList<Student> getStudents(){
        return stud;
    }
}
class Student  {
    String name;
    int rollNumber;
    Student(String name, int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    String printDetails() {
        return "Name: "+name+" RollNumber: "+rollNumber;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Rakesh",523);
        Student s2 = new Student("Vikas",507);
        Student s3 = new Student("Karthik",553);
        ArrayList<Student> stud = new ArrayList<>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        School s= new School("Bits",stud);
        System.out.println("Student Information: ");
        for(Student st: s.getStudents()){
            System.out.println(st.printDetails());
        }
    }
}
/*
here both school and student are with HAS A relation
i.e school has students
soo if they are partially depends if we delete the School object
Students will exists . if we delete a Specific Student object Other will exits
 */
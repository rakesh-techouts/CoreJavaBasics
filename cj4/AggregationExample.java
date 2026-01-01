package javabasics.cj4;


import java.util.ArrayList;
import java.util.List;
class Student {

    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId)
    {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getstudentId() {
        return studentId;
    }

    public String getstudentName() {
        return studentName;
    }
}

class Department {


    private String deptName;
    private List<Student> students;

    public Department(String deptName, List<Student> students)
    {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
}

class Institute {


    private String instituteName;
    private List<Department> departments;


    public Institute(String instituteName,
                     List<Department> departments)
    {

        this.instituteName = instituteName;
        this.departments = departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students = null;

        for (Department dept : departments) {
            students = dept.getStudents();

            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}


public class AggregationExample {
    public static void main(String[] args)
    {
        Student s1 = new Student("Rakesh", 1);
        Student s2 = new Student("Vikas", 2);
        Student s3 = new Student("Karthik", 1);
        Student s4 = new Student("Ram", 2);

        Student s5 = new Student("Ramesh", 23);
        //adding CSE Students
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        List<Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        // Creating Department object with a Students list
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        CSE.addStudent(s5);

        // Creating an initial list of Departments
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        // Creating an Institute object with Departments list
        Institute institute = new Institute("BITS", departments);


        System.out.print("Total students in institute: ");

        System.out.print(
                institute.getTotalStudentsInInstitute());
    }
}
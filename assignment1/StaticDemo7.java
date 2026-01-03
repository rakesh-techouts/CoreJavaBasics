package javabasics.assignment1;

public class StaticDemo7 {
    static String name="tech-outs";
    static int empId=2358;
    static String printName(){
        return name;
    }
    static int printEmpID(){
        return empId;
    }
    public static void main(String[] args) {
        //in same class
        System.out.println("Employee Name: "+printName());
        System.out.println("Employee ID: "+printEmpID());

        //in other class
        System.out.println("Employee Name: "+ StaticDemo7.printName());
        System.out.println("Employee ID: "+ StaticDemo7.printEmpID());
    }
}

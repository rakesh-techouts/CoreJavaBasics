package javabasics.assignment1;

abstract class Person{
    abstract void setName(String name);
    abstract  void setEmailId(String email);
    void show(){
        System.out.println("This is Person Show method");
    }
}
class Employee extends Person {
    String name;
    String email;

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    void setEmailId(String email) {
        this.email=email;
    }
    void printDetails(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Email: "+email);
    }
}
public class Abstract11 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Rakesh");
        e.setEmailId("rakesh@gmail.com");
        e.printDetails();
        e.show();
    }
}

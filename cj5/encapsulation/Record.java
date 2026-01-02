package javabasics.cj5.encapsulation;

record Student(String name,String hallTicket, float marks) { }


public class Record {
    public static void main(String[] args) {
        Student s = new Student("Rakesh","22C31A0523",99.98f);
        System.out.println("Name: "+s.name());
        System.out.println("Hall Ticket: "+s.hallTicket());
        System.out.println("Marks: "+s.marks());
    }
}

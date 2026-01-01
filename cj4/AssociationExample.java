package javabasics.cj4;


import java.util.*;

class Bank {


    private String bankName;
    private Set<Employee> employees;

    public Bank(String bankName)
    {
        this.bankName = bankName;
    }

    public String getBankName()
    {
        return this.bankName;
    }

    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }

    public Set<Employee> getEmployees()
    {
        return this.employees;
    }
}


class Employee {

    private String name;

    public Employee(String name)
    {
        this.name = name;
    }

    public String getEmployeeName()
    {
        return this.name;
    }
}


public class AssociationExample {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Rakesh");
        Employee emp2 = new Employee("Rama");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);


        Bank bank = new Bank("Union Bank Of India");


        bank.setEmployees(employees);

        for (Employee emp : bank.getEmployees()) {
            System.out.println(emp.getEmployeeName()
                    + " belongs to bank "
                    + bank.getBankName());
        }
    }
}
